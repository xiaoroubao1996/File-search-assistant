import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import javax.print.attribute.standard.RequestingUserName;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Integration {
    public static String ResultSQL;

    public Integration() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer requête : ");
        String s = scanner.nextLine();
        AnalyseSyntaxique myAnalyseSyntaxique = new AnalyseSyntaxique(s);
        s = myAnalyseSyntaxique.Result;
        System.out.println("Requête normalisé : " + s);
        try {
            tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(s)));
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
//        s = scanner.nextLine();
    }
}