package learn.jdbc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learn.jdbc.po.Bank;
import learn.jdbc.service.*;

public class AddBank extends HttpServlet {
	private BankService bankService=new BankServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doPost(request, response);	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			Bank bank=new Bank();
			bank.setID(request.getParameter("ID"));
			bank.setPID(request.getParameter("PID"));
			bank.setGID(request.getParameter("GID"));
			bank.setName(request.getParameter("Name"));
			bank.setLevel(request.getParameter("Level"));
			bank.setStatus(request.getParameter("Status"));
			bank.setReserved(request.getParameter("Reserved"));
			
			bankService.add(bank);
			request.getRequestDispatcher("queryBank").forward(request, response);
	}

}
