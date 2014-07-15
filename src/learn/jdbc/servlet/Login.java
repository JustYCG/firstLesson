package learn.jdbc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import learn.jdbc.DAO.OperatorDAOImpl;
import learn.jdbc.po.Operator;
import learn.jdbc.service.OperatorService;
import learn.jdbc.service.OperatorServiceImpl;



public class Login extends HttpServlet {
	private OperatorService operatorService=new OperatorServiceImpl();
	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.setCharacterEncoding("UTF-8");
		String OperatorID = request.getParameter("OperatorID"); 		
		String Password = request.getParameter("Password"); 
		Operator operatorInf=operatorService.login(OperatorID, Password);
		System.out.println(operatorInf.getName());
		System.out.println(operatorInf.getPID());
		if(operatorInf == null){
			response.sendRedirect("./error.jsp");
		}else{
			HttpSession session=request.getSession();
			session.setAttribute("operatorInf", operatorInf);
			//request.setAttribute("operatorInf", operatorInf);
			request.getRequestDispatcher("./index.jsp").forward(request, response);
		}
	}

}
