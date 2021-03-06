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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String name=(String) request.getAttribute("k1");
			String dept=(String) request.getAttribute("k2");
			String desg=(String) request.getAttribute("k3");
			String company=(String) request.getAttribute("k4");
			String mobile=(String) request.getAttribute("k5");
			String email=(String) request.getAttribute("k6");
				response.setContentType("text/html");
				PrintWriter pw=response.getWriter();
				pw.println("<html><body>");
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
				String sql="insert into employee values (?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, dept);
				ps.setString(3, desg);
				ps.setString(4, company);
				ps.setString(5, mobile);
				ps.setString(6, email);
				int c=ps.executeUpdate();
				if(c!=0)
					pw.println("<b>record inserted....</br>");
				else
					pw.println("<b>record not inserted....</br>");
				pw.println("</body></html>");
				pw.close();
				ps.close();
				con.close();
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
