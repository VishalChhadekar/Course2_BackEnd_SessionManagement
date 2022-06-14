package com.HiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.println("<h1>Hello " + name + " Welcom to Servlet One<h1>");
//		
		// Response of first Servlet sent as request to second servlet through hidden
		// form filed
		
		
		//if input type is text: we can see name in box
//		out.println("" + "<form action = 'SecondServlet'>" + "<input type = 'text' name = 'user_name' value ='" + name
//				+ "' >" + "<button>Go to second Servlet</button>" + "" + "</form>");
		
		
		//if type= hidden; we can not see it
		out.println("" + "<form action = 'SecondServlet'>" + "<input type = 'hidden' name = 'user_name' value ='" + name
				+ "' >" + "<button>Go to second Servlet</button>" + "" + "</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
