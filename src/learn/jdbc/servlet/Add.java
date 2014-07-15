package learn.jdbc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learn.jdbc.po.Operator;
import learn.jdbc.service.OperatorService;
import learn.jdbc.service.OperatorServiceImpl;

public class Add extends HttpServlet {
	OperatorService operatorService=new OperatorServiceImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.setCharacterEncoding("UTF-8");
		Operator operator=new Operator();
		String bankID=request.getParameter("BankID");
		String operatorID=request.getParameter("OperatorID");
		String sigCod=request.getParameter("SigCod");
		String node=request.getParameter("Node");
		int status=Integer.parseInt(request.getParameter("Status"));
		String permission=request.getParameter("Permission");
		String password=request.getParameter("Password");
		String operatorName=request.getParameter("OperatorName");
		String creator=request.getParameter("Creator");
		String checker=request.getParameter("Checker");
		String createDate=request.getParameter("CreateDate");
		String reserved=request.getParameter("Reserved");
		
		operator.setBankID(bankID);
		operator.setOperatorID(operatorID);
		operator.setOperatorName(operatorName);
		operator.setPassword(password);
		operator.setSigCod(sigCod);
		operator.setReserved(reserved);
		operator.setCreator(creator);
		operator.setChecker(checker);
		operator.setCreateDate(createDate);
		operator.setStatus(status);
		operator.setNode(node);
		operator.setPermission(permission);
		
		operatorService.add(operator);
		request.getRequestDispatcher("query").forward(request, response);

	}

}
