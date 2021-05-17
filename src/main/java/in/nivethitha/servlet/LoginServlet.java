package in.nivethitha.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nivethitha.service.Login;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Successful");
		Long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
		int pin = Integer.parseInt(request.getParameter("pin"));
		boolean valid;

		valid = Login.isExist(accountNumber, pin);

		if (valid) {
			String message = "Welcome to ATM Services";
			response.sendRedirect("Message.jsp?infoMessage=" + message);

		} else {
			String message = "Invalid Login Credentials";
			response.sendRedirect("Login.jsp?errorMessage=" + message);
		}

	}

}
