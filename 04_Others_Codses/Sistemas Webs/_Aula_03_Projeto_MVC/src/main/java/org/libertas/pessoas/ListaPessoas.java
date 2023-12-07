package org.libertas.pessoas;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

import com.google.gson.Gson;
import com.google.gson.internal.GsonBuildConfig;

/**
 * Servlet implementation class ListaPessoas
 */
public class ListaPessoas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaPessoas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Instancia lista de pessoas
		LinkedList<Pessoa> lista = new LinkedList();
		
		//Instancia uma nova pessoa
		Pessoa p = new Pessoa();
		
		//atribui valores a ela
		p.setNome("Sua mãe");
		p.setIdade(11);
		p.setTelefone("(11) 99766-0066");
		
		//Adiciona esta pessoa na lista
		lista.add(p);
		
		//Transforma objeto em JSON
		Gson gson = new Gson();
		String json = gson.toJson(lista);
		
		//Imprime resultado
		response.getWriter().print(json);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
