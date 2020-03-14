

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
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try
		{

		String empno=request.getParameter("empno");
		String empname=request.getParameter("empname");
		String job=request.getParameter("job");
		String manager=request.getParameter("manager");
		String hiredate=request.getParameter("hiredate");
		String salary=request.getParameter("salary");
		String commission=request.getParameter("commission");
		String departmentno=request.getParameter("departmentno");

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Training","root","root");

		PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?)");
		pst.setString(1,empno );
		pst.setString(2,empname);
		pst.setString(3,job);
		pst.setString(4,manager);
		pst.setString(5,hiredate);
		pst.setString(6,salary);
		pst.setString(7,commission);
		pst.setString(8,departmentno);

		int count=pst.executeUpdate();

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		      if(count!=0)
		       out.println("<b>Succesfully Inserted.....");
		      else
		       out.println("<b>Insertion Not Done..");
		out.println("</body></html>");

		}
		catch(Exception e)
		{
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
