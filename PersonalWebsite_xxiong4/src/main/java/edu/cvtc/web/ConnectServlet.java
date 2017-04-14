package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConnectServlet
 */
@WebServlet("/connect")
public class ConnectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String target ="/thanks.jsp";
		
		final String firstName = request.getParameter("firstName");
		final String lastName = request.getParameter("lastName");
		final String email = request.getParameter("email");
		
		final User user = new User(firstName, lastName, email);
		
		if (firstName != null && !firstName.isEmpty() 
				&& lastName != null && !lastName.isEmpty()
				&& email != null && !email.isEmpty()) {
			
				// todo: Insert the new user into the connection database
			System.out.println("A new user should be added to the database...");
			
		} else { // did not pass validation
			target = "/contact.jsp";
			final String message = "Please completely fill out the form.";
			request.setAttribute("message", message);
		}
		
		request.setAttribute("user", user);
		
		getServletContext().getRequestDispatcher(target).forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
