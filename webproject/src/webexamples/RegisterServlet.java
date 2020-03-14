package webexamples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			//obtaining values from html
			String name=request.getParameter("name");
			String dept=request.getParameter("dept");
			String desig=request.getParameter("desg");
			String company=request.getParameter("company");
			String mobile=request.getParameter("mobile");
			String email=request.getParameter("email");
			//database function
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			//dynamic query
			PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, dept);
			pst.setString(3, desig);
			pst.setString(4, company);
			pst.setString(5, mobile);
			pst.setString(6, email);
			//execute the query
			int count =pst.executeUpdate();
			//setting the response
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<html><body>");
			if(count==1)
			pw.println("<b>REGISTRATION DONE</b>");
			else
			pw.println("<b>NOT</b>");
			pw.println("</body></html>");
			pst.close();
			con.close();
			pw.close();


			}
			catch(Exception e) {

			System.out.println(e);
			}
			}

		


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
