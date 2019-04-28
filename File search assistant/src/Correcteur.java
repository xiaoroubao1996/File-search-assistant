import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

@WebServlet(name = "Correcteur")
public class Correcteur extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<head>");
        out.print("<style>form { display: inline-block; }</style>");
        out.println("<title>Correcteur orthographe</title>");
        out.println("<form action=\"modifier\">\n");
        String requete = request.getParameter("requete");
        StringTokenizer st = new StringTokenizer(requete, " ", false);
        String currentMot;
        AnalyseSyntaxique as = new AnalyseSyntaxique(requete);
        HashMap<String, String> dictionnaire = as.getDictionnaire();
        HashMap<String, String> dictionnaireInverse = as.getDictionnaireInverse();
        HashMap<String, String> lemme = as.getLemme();
        HashMap<String, String> lemmeInverse = as.getLemmeInverse();

        String resultCorrige = "";
        String tmp;

        while (st.hasMoreElements()) {
            currentMot = st.nextToken().toLowerCase();
            if (lemmeInverse.get(currentMot) != null) {
                tmp = lemmeInverse.get(currentMot);
                out.println(tmp);
                resultCorrige += tmp + " ";
            } else {
                ArrayList<String> motLemmePrefix = as.Prefix(currentMot, lemmeInverse);
                ArrayList<String> motLemmeLeven = as.Levenshtein(currentMot, lemmeInverse);
//                ArrayList<String> motDictPrefix = as.Prefix(currentMot, dictionnaireInverse);
//                ArrayList<String> motDictLeven = as.Levenshtein(currentMot, dictionnaireInverse);

                ArrayList<String> motList = new ArrayList<String>();
                motList.addAll(motLemmeLeven);
                motList.addAll(motLemmePrefix);
//                motList.addAll(motDictPrefix);
//                motList.addAll(motDictLeven);

                Set<String> resList = new HashSet<String>(motList);
                if (resList.size() == 0) {
                    out.print(currentMot + "&nbsp;");
                    resultCorrige += currentMot + " ";
                } else
                    if (resList.size() == 1) {
                        String my_tmp = resList.iterator().next();
                        out.print(my_tmp + "&nbsp;");
                        resultCorrige += my_tmp + " ";
                    } else {
                        createOption(out, resList);
                        resultCorrige += "[CHANGE]" + " ";
                    }
            }
        }
        out.println("&nbsp;<input type=\"submit\" name=\"submit\" value=\"Valider\"/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        System.out.println(resultCorrige);
        request.getSession().setAttribute("resultCorrige", resultCorrige);
        request.getSession().setAttribute("finalSaisie", requete);
    }

    public void createOption(PrintWriter out, Set<String> listOption) {
        out.print("<select name=\"mot\" multipe id=\"mot\">");
        for(String mot : listOption)
            out.print("<option value=\"" + mot + "\">" + mot + "</option>");
        out.print("</select>&nbsp;");
    }
}
