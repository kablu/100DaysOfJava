import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void init() throws ServletException
	{
		System.out.println("--------------------------------------");
		System.out.println(" Init method is called in "
		        + this.getClass().getName());
		System.out.println("--------------------------------------");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");

		if (userName.equalsIgnoreCase("ram") && passWord.equals("ram"))
		{
			response.sendRedirect("http://localhost:8080/SendRedirectDemo/welcome");
		}
		else
		{
			out.print("Sorry UserName or Password is Wrong!");
			RequestDispatcher requestDispatcher = request
			        .getRequestDispatcher("/index.html");
			requestDispatcher.include(request, response);
		}
	}

	public void destroy()
	{
		System.out.println("----------------------------------------");
		System.out.println(" destroy method is called in "
		        + this.getClass().getName());
		System.out.println("-----------------------------------------");
	}
}