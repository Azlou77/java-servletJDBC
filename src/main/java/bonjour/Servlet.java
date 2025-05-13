package bonjour;
import jakarta.servlet.ServletException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Servlet extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"utf-8\" />");
	    out.println("<title>Test</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h2> Support technique: confirmation de la demande  </h2>"); 
	    out.println("<p>Prénom : " + request.getParameter("prenom") + "</p>");
	    out.println("<p>Nom : " + request.getParameter("nom") + "</p>");
	    out.println("<p>Email : " + request.getParameter("email") + "</p>");
	    out.println("<p>Téléphone : " + request.getParameter("tel") + "</p>");
	    out.println("<p>Logiciel : " + request.getParameter("logiciel") + "</p>");
	    out.println("<p>Système d'exploitation : " + request.getParameter("os") + "</p>");
	    out.println("<p>Problème : " + request.getParameter("issue") + "</p>");
	    out.println("<p>Merci pour vos informations  </p>");
	    out.println("<p>Votre problème sera résolue dans les 24  heures </p>");
	    out.println("</body>");
	    out.println("</html>");
    }
	
}