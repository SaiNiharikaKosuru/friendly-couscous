package webexamples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet11
 */
@WebServlet("/Servlet11")
public class Servlet11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet11() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String dept=request.getParameter("dept");
		String desg=request.getParameter("desg");
		request.setAttribute("k1",name);
		request.setAttribute("k2",dept);
		request.setAttribute("k3",desg);
		request.setAttribute("k4","cts");
		request.setAttribute("k5","9966933566");
		request.setAttribute("k6","xyz@gmail.com");
		ServletContext st=this.getServletContext();
		RequestDispatcher rd=st.getRequestDispatcher("/Servlet2");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
