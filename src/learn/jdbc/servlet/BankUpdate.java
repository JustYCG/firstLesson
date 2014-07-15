package learn.jdbc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learn.jdbc.po.Bank;
import learn.jdbc.service.BankService;
import learn.jdbc.service.BankServiceImpl;

public class BankUpdate extends HttpServlet {
	private BankService bankService=new BankServiceImpl();
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

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			Bank bank=new Bank();
			String ID=request.getParameter("ID");
			String PID=request.getParameter("PID");
			String GID=request.getParameter("GID");
			String Name=request.getParameter("Name");
			String Status=request.getParameter("Status");
			String Level=request.getParameter("Level");
			String Reserved=request.getParameter("Reserved");
			
			bank.setID(ID);
			bank.setPID(PID);
			bank.setGID(GID);
			bank.setName(Name);
			bank.setStatus(Status);
			bank.setLevel(Level);
			bank.setReserved(Reserved);
			
			
			bankService.update(bank);
			request.getRequestDispatcher("queryBank").forward(request, response);
	}

}
