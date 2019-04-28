import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import javax.print.attribute.standard.RequestingUserName;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Integration {
    public static String ResultSQL;
    public String Requete;
    public Integration(String RequeteNT) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Entrer requête : ");
        //String s = scanner.nextLine();
    	Requete = RequeteNT;
        AnalyseSyntaxique myAnalyseSyntaxique = new AnalyseSyntaxique(Requete);
        Requete = myAnalyseSyntaxique.Result;
        System.out.println("Requête normalisé : " + Requete);
        try {
            tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(Requete)));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tal_sqlParser parser = new tal_sqlParser(tokens);
            String arbre = parser.listerequetes();
            // Traitement ()
            arbre = arbre.replace('(', ' ');
            arbre = arbre.replace(')', ' ');
            arbre = arbre.replace('[', '(');
            arbre = arbre.replace(']', ')');
            arbre = arbre.replaceAll(" +", " ").trim();
            System.out.println(arbre);
            ResultSQL = arbre;
        } catch(Exception e) {}
//        System.out.print("Entrer requête : ");
//        Requete = scanner.nextLine();
    }
    
    public String getResult(){
    	return ResultSQL;
    }
}