import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
import java.io.*;

public class LanceRequete extends HttpServlet {
	String username;
	String password;
	String url;
	String requete ="";
	String nom;
	int nbre;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Lance requete!</title>");
        printJavaScript(out);
        out.println("</head>");
        out.println("<body>");
        printFormCorrige(out);
	// ---- configure START
	username = "lo17xxx";
	password = "dblo17";
	// The URL that will connect to TECFA's MySQL server
        // Syntax: jdbc:TYPE:machine:port/DB_NAME
        url = "jdbc:postgresql://tuxa/dblo17";
	// dans certaines configurations locales il faut d�finir l'url par :
	// url = "jdbc:postgresql://tuxa.sme.utc
	// ---- configure END

	String requete;
    requete = request.getParameter("requete");
    Integration myIntegration = new Integration(requete);
	requete = myIntegration.getResult();
	
	if (requete != null) {
		// INSTALL/load the Driver (Vendor specific Code)
		try {
			Class.forName("org.postgresql.Driver");
			} catch(java.lang.ClassNotFoundException e) {
	    		System.err.print("ClassNotFoundException: ");
	    		System.err.println(e.getMessage());
			}
		try {
			Connection con;
			Statement stmt;
			// Establish Connection to the database at URL with usename and password
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			// Send the query and bind to the result set
			ResultSet rs = stmt.executeQuery(requete);
			ResultSetMetaData rsmd=rs.getMetaData();
			nbre=rsmd.getColumnCount();
			while (rs.next()) {
				for (int i=1; i<=nbre;i++){
				nom = rsmd.getColumnName(i);
				String s = rs.getString(nom);
				s = ajouteLien(s);
				out.print(s);
				}
			out.print("<p>");
			}
		out.println("</body>");
		out.println("</html>");
		// Close resources
		stmt.close();
		con.close();
		}
		// print out decent erreur messages
		catch(SQLException ex) {
			System.err.println("==> SQLException: ");
			while (ex != null) {
				System.out.println("Message:   " + ex.getMessage ());
				System.out.println("SQLState:  " + ex.getSQLState ());
				System.out.println("ErrorCode: " + ex.getErrorCode ());
				ex = ex.getNextException();
				System.out.println("");
	    			}
			}
        	}
	}
    
    public String ajouteLien(String s){
    	if(s.matches("htm")){
    		return "<a href=\"../BULLETINS_LO17/" + s + "\">"+ s + "</a>";
    	}
    	return s;
    }
    
    public void printJavaScript(PrintWriter out){
    	out.println("<script language=\"javascript\">");
    	out.println("function testListe(){");
		out.println("	nb=form.mot.length;");
		out.println("i=0");
		out.println("for(i=0;i<nb;i++){");
		out.println("	if(form.mot.options[i].selected){");
		out.println("		sMotName=form.mot.options[i].value;");
		out.println("		alert(\"tu as choisi \" + sMotName);");
		out.println("	}");
		out.println("}");
		out.println("}");
		out.println("</script>");
    }
    
    public void printFormCorrige(PrintWriter out){
    	out.println("<form id=\"form\" name=\"form\" method=\"\" action=\"\">");
		out.println("<p>choisis ton mot</p>");
		out.println("<select name=\"mot\" multipe id=\"mot\">");
		out.println("<option value=\"mot1\">mot1</option>");
    	out.println("<option value=\"mot2\">mot2</option>");
		out.println("</select>");
		out.println("<input type=\"submit\" name=\"submit\" value=\"valide apres avoir choisi\" onclick=\"testListe()\"/>");
		out.println("</form>");
    }
}
