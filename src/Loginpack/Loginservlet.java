package Loginpack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Loginservlet
 */
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession s;
    /**
     * Default constructor. 
     */
    public Loginservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//login check
		String username=request.getParameter("un");
		String password=request.getParameter("pass");
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		Loginservice sr=new Loginservice();
		boolean valid=sr.login(user);
		if(valid){
			s.setAttribute("loggedin", true);
			response.sendRedirect("welcome.jsp");
		}
		else{
			response.sendRedirect("Login.jsp");
		}
		
	}

}