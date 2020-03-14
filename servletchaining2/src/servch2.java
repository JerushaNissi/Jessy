

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
 * Servlet implementation class servch2
 */
@WebServlet("/servch2")
public class servch2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servch2() {
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
		response.setContentType("text/html");

		String name=request.getParameter("name");
		String dept=request.getParameter("dept");
		String desg=request.getParameter("desig");
		String comp=(String)request.getAttribute("comp");
		String mobile=(String)request.getAttribute("mobile");
		String email=(String)request.getAttribute("email");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		PreparedStatement pst=con.prepareStatement("insert into employee values( ?,?,?,?,?,?)");
		pst.setString(1,name);
		pst.setString(2,dept);
		pst.setString(3,desg );
		pst.setString(4,comp );
		pst.setString(5,mobile);
		pst.setString(6,email);
		int count=pst.executeUpdate();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		        if(count!=0)
		        out.println("<b>user Registered");
		        else
		        out.println("<b>Not Registered");
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
