package adduserpack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addusers
 */
public class Adduser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adduser() {
        super();
//        System.out.println("What?");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("hello!!iam adduserservlet");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String email=request.getParameter("email");
		String  phone=request.getParameter("phone");
		//int phone1=Integer.parseInt(phone);
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		userAdd useradd=new userAdd();
		useradd.setFirstname(firstname);
		useradd.setLastname(lastname);
		useradd.setEmail(email);
		useradd.setPhone(phone);
		useradd.setUsername(username);
		useradd.setPassword(password);
		Adduserservice add_c=new Adduserservice();
		boolean valid_check=add_c.check_adduser(useradd);
		if(valid_check){
			response.sendRedirect("welcome.jsp");
		}
		else{
			response.sendRedirect("register.jsp");
		}
	}
	

}
