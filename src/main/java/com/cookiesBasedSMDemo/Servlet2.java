package com.cookiesBasedSMDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		// getting cookies
		Cookie[] cookies = request.getCookies();

		boolean flage = false;
		String name = "";
		if (cookies == null) {
			out.println("You are new user, Please go to home page and enter you name");
			return;
		} else {
			// checking if the cookie is avalable or not
			for (Cookie c : cookies) {
				if (c.getName().equals("user_name")) {
					flage = true;
					name = c.getValue();
				}
			}
		}
		if (flage) {

			out.println("<h1>Hello " + name + " Welcom back<h1>");
		} else {
			out.println("You are new user, Please go to home page and enter you name");
		}

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
