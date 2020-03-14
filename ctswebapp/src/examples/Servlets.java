package examples;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Servlet")
public class Servlets extends GenericServlet implements javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     * @return 
     */
    public void Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<b> Welcome to Servlet Programming </b>");
		out.println("</body></html>");
		out.close();
		
	}

}
