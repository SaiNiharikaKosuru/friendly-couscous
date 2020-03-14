package webexamples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchingServlet
 */
@WebServlet("/SearchingServlet")
public class SearchingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchingServlet() {
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
			String name=request.getParameter("search");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			PreparedStatement pst=con.prepareStatement("select * from employee where name=?");
			pst.setString(1,name);
			ResultSet rs=pst.executeQuery();
			rs.next();

			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<html><body>");
			pw.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3));
			pw.println("</body></html>");
			pst.close();
			con.close();
			pw.close();

			}
			catch(Exception e) {

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
