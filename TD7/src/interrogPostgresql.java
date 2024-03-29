import java.sql.*;
import java.io.*;

public class interrogPostgresql  {
	public static void main(String args[]) throws SQLException {

	String username;
	String password;
	String url;
	String nom;
	int nbre;
	
	// ---- configure START
	username = "lo17xxx";
	password = "dblo17";
	// The URL that will connect to TECFA's MySQL server
	// Syntax: jdbc:TYPE:machine:port/DB_NAME
	url = "jdbc:postgresql://tuxa.sme.utc/dblo17";

	Integration myIntegration = new Integration();
	String requete = myIntegration.ResultSQL;
//	requete="select distinct fichier,rubrique from titretexte where mot='micro';";
//	requete="select distinct but.fichier FROM numero as but JOIN texte as textenanotechno ON but.fichier = textenanotechno.fichier AND but.numero= textenanotechno.numero AND textenanotechno.mot = 'nanotechnologie' ;";
//	requete="select distinct but.fichier FROM numero as but JOIN texte as textetechnologie ON but.fichier = textetechnologie.fichier AND but.numero= textetechnologie.numero AND textetechnologie.mot = 'technolog' ;";
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
		while (rs.next()) {
 			String s = rs.getString("fichier");
			System.out.println(s);
//			System.out.print("\t");
//			s = rs.getString("rubrique");
//			System.out.print(s);
//			System.out.println();
		}
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
