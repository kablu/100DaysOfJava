import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException
	{
		System.out.println("--------------------------------------------");
		System.out.println(" Init method is called in "
		        + this.getClass().getName());
		System.out.println("---------------------------------------------");
	}

	public void doGet( HttpServletRequest request, HttpServletResponse response )
	        throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String CompanyName = (String) request.getAttribute("CompanyName");
		out.print("CompanyName :  " + CompanyName + "<br>");

		out.print("*************************************************************"
		        + "<br>");

		Enumeration<String> namesEnum = request.getAttributeNames();
		while( namesEnum.hasMoreElements() )
		{
			String name = (String) namesEnum.nextElement();
			out.print(name + ":");
			Object value = request.getAttribute(name);
			out.print(value);
			out.print("<br>");
		}

		out.close();
	}

	public void destroy()
	{
		System.out.println("--------------------------------------------");
		System.out.println(" destroy method is called in "
		        + this.getClass().getName());
		System.out.println("--------------------------------------------");
	}

}