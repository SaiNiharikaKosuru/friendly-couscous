package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import mvc.Employee;

/**
 * Servlet implementation class AddEmpServlet
 */
@WebServlet("/AddEmpServlet")
public class AddEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		EmployeeDao empdao=new EmployeeDao();
		Employee emp=new Employee();
		String empid=request.getParameter("empid");
		String ename=request.getParameter("ename");
		String dept=request.getParameter("dept");
		String desg=request.getParameter("desg");
		String emailid=request.getParameter("emailid");
		
		emp.setDept(dept);
		emp.setDesg(desg);
		emp.setEmailid(emailid);
		emp.setEname(ename);
	    emp.setEmpid(empid);
		
		
		
		
			int flag=empdao.insertEmployee(emp);
		
		if(flag==1) {
			RequestDispatcher rd=request.getRequestDispatcher("insertionSuccess.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("insertionFailure.jsp");
			rd.forward(request, response);
			
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
