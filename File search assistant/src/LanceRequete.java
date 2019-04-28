import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.sql.*;
import java.io.*;


// @WebServlet(name = "LanceRequete")
public class LanceRequete extends HttpServlet {
    String username;
    String password;
    String url;
    String requete ="";
    String nom;
    int nbre;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<head>");
        out.println("<title>Lance requete!</title>");
        printJavaScript(out);
        out.println("</head>");
        out.println("<body>");
        // ---- configure START
        username = "lo17xxx";
        password = "dblo17";
        // The URL that will connect to TECFA's MySQL server
        // Syntax: jdbc:TYPE:machine:port/DB_NAME
        // url = "jdbc:postgresql://tuxa/dblo17?sslmode=require";
        url = "jdbc:postgresql://tuxa.sme.utc/dblo17?sslmode=require";
        // ---- configure END
        String requete = (String)request.getSession().getAttribute("finalLanceRequete");

        String finalCorrige = requete;
        String finalSaisie = (String)request.getSession().getAttribute("finalSaisie");

        Integration myIntegration = new Integration(requete);
        requete = myIntegration.getResult();
        String finalAvantSql = myIntegration.getFinalAvantSql();
        String finalRequeteNormalise = myIntegration.getFinalRequeteNormalise();

        // TEST
//        requete = "select count(mot) from titretexte;";

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
                out.print("<h1>Résultats de votre recherche</h2>");
                out.print("<h2>Requête saisie</h2>");
                out.print("<p>" + finalSaisie + "<p>");
                out.print("<h2>Requête corrigé orthographique</h2>");
                out.print("<p>" + finalCorrige + "<p>");
                out.print("<h2>Requête normalisé</h2>");
                out.print("<p>" + finalRequeteNormalise+ "<p>");
                out.print("<h2>Requête presque SQL</h2>");
                out.print("<p>" + finalAvantSql + "<p>");
                out.print("<h2>Requête SQL</h2>");
                out.print("<p>" + requete + "<p>");

                out.print("<table border=\"1\" cellpadding=\"10\">");
                out.print("<h2>Resultat</h2>");
                out.print("<tr>");
                for (int i=1; i<=nbre;i++){
                    out.print("<td>");
                    nom = rsmd.getColumnName(i);
                    out.print(nom + "\t");
                    if(i==1){out.print("\t");}
                    out.print("</td>");
                }
                out.print("</tr>");
                out.print("<tr>");
                while (rs.next()) {
                    for (int i=1; i<=nbre;i++){
                        out.print("<td>");
                        nom = rsmd.getColumnName(i);
                        String s = rs.getString(nom);
                        s = ajouteLien(s, out);
                        out.print(s + "\t");
                        out.print("</td>");
                    }
                    out.print("<tr>");
                }
                out.print("</table>");
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

    public String ajouteLien(String s, PrintWriter out){
        if(s.matches("(.*)htm( )?")){
            return "<a href=\"http://www4.utc.fr/~lo17/TELECHARGE/BULLETINS_LO17/" + s + "\">"+ s + "</a>";
        }
        return s;
    }

    public void printJavaScript(PrintWriter out){
        out.println("<script language=\"javascript\">");
        out.println("function testListe(){");
        out.println("   nb=form.mot.length;");
        out.println("i=0");
        out.println("for(i=0;i<nb;i++){");
        out.println("   if(form.mot.options[i].selected){");
        out.println("       sMotName=form.mot.options[i].value;");
        out.println("       alert(\"tu as choisi \" + sMotName);");
        out.println("   }");
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