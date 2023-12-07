package org.libertas;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Exemplo2
 */
public class Exemplo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exemplo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><meta charset='utf-8'> <style> body{background-color:'red';} </style></head>");
		out.print("<body>");
		out.print("<table border='1'>");
		out.print("<h1>Olá João Vinícius</h1>");
		for (int i=0; i<11; i++) {
			out.print("<tr><td colspan='5'>Tabuada do: "+ i+"</td></tr>");
			for (int j=0; j<11; j++) {
			out.print("<tr><td>"+ i +"</td><td>"+"X"+"</td><td>"+j+"</td><td>"+"="+"</td><td>"+(i*j)+"</td></tr>");
		}
		}
		out.print("</table>");
		
		int posicao = 20;
		int ultimoTermo = 1;
		int penultimo = 1;
		
		for (int i=2; i>20; i++) {
			int termo = ultimoTermo + penultimo;
			penultimo = ultimoTermo;
			ultimoTermo = termo;
			i += 1;
			out.print("<p>"+termo+"</p>");
			
		}
		
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
