import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

@WebServlet(name = "Modifier")
public class Modifier extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] mots = request.getParameterValues("mot");
        String resultCorrige = (String)request.getSession().getAttribute("resultCorrige");
        StringTokenizer st = new StringTokenizer(resultCorrige, " ", false);
        String currentMot, resultLanceRequete = "";
        int i = 0;
        while (st.hasMoreElements()) {
            currentMot = st.nextToken();
//            System.out.println(currentMot);
            if (currentMot.equals("[CHANGE]")) {
                resultLanceRequete += mots[i] + " ";
                i++;
            } else resultLanceRequete += currentMot + " ";
        }
        if (resultLanceRequete.isEmpty()) resultLanceRequete = resultCorrige;
        resultLanceRequete = resultLanceRequete.trim();
        resultLanceRequete = resultLanceRequete.replaceAll("\\s+", " ");
        if (!resultLanceRequete.endsWith(".")) resultLanceRequete += ".";
//        System.out.println(resultLanceRequete);
        request.getSession().setAttribute("finalLanceRequete", resultLanceRequete);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<head>");
        out.println("Confirmer votre requete : " + resultLanceRequete);
        out.println("</head>");
        out.println("</html>");

        out.println("<form action=\"servlet\">\n");
        out.println("&nbsp;<input type=\"submit\" name=\"submit\" value=\"Valider\"/>");
        out.println("</form>");
    }
}
