

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
			int flag=0;
			String lid=request.getParameter("UserId");
			String pwd=request.getParameter("Password");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Training","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Login");
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			while(rs.next()) {
				String t1 = rs.getString(1);
				String t2 = rs.getString(3);
				if((lid.equals("admin"))&&(pwd.equals("admin")))
				{
				flag=1;
				break;
				}

				else if(lid.equals(t1)&& pwd.equals(t2))
				{
				flag=2;
				break;
				}
			  }
			if(flag==1)
			{
				out.println("<b>You are an Admin</b>");
				ServletContext ctx=this.getServletContext();
				RequestDispatcher rd=ctx.getRequestDispatcher("/Authorized.html");
				rd.include(request, response);
			}
			else if(flag==2)
			{
				out.println("<b>You are an Associate</b>");
				ServletContext ctx=this.getServletContext();
				RequestDispatcher rd=ctx.getRequestDispatcher("/AssociateServlet");
				rd.forward(request, response);
			}
			else {
				out.println("<b>Unauthoried user</b>");
				ServletContext ctx=this.getServletContext();
				RequestDispatcher rd=ctx.getRequestDispatcher("/UnAuthorized.html");
				rd.forward(request,response);
			}
				
			out.println("</html></body>");
			
			out.close();
			rs.close();
			st.close();
			con.close();
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
