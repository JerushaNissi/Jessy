

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
 * Servlet implementation class RegisterServletEx
 */
@WebServlet("/RegisterServletEx")
public class RegisterServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServletEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			String name=request.getParameter("name");
			String dept=request.getParameter("dept");
			String desg=request.getParameter("desg");
			String company=request.getParameter("company");
			String mobile=request.getParameter("mobile");
			String email=request.getParameter("email");
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nissi","root","root");
			
			PreparedStatement pst=con.prepareStatement("insert into employee values( ?,?,?,?,?,?)");
			pst.setString(1,name );
			pst.setString(2,dept);
			pst.setString(3,desg );
			pst.setString(4,company);
			pst.setString(5,mobile );
			pst.setString(6,email );
			int count=pst.executeUpdate();
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			if(count==1)
				out.println("<b>Registration successfull</b>");
			else
				out.println("<b>Sorry....!try again:)</b>");
			
				
			out.println("</html></body>");
			pst.close();
			con.close();
			out.close();
			
		}catch(Exception e)
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
