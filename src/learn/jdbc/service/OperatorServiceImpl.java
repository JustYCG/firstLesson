package learn.jdbc.service;
/*
 * 实现操作
 */

import java.util.List;

import learn.jdbc.DAO.OperatorDAO;
import learn.jdbc.DAO.OperatorDAOImpl;
import learn.jdbc.po.Operator;

public class OperatorServiceImpl implements OperatorService {
	
	private OperatorDAO operatorDAO=new OperatorDAOImpl();
	
	//遍历操作
	public List<Operator> queryAll() {
		// TODO Auto-generated method stub
		return operatorDAO.queryAll();
	}
	
	/*//删除操作
	public void delete(int Id) {
		// TODO Auto-generated method stub
		proDAO.delete(Id);
	}

	//添加操作
	public void add(int Id, String productName) {
		// TODO Auto-generated method stub
		proDAO.add(Id, productName);
	}

	//更新操作
	public void update(int Id, String productName) {
		// TODO Auto-generated method stub
		proDAO.update(Id, productName);
		
	}*/

	@Override
	public void add(Operator operator) {
		// TODO Auto-generated method stub
		operatorDAO.add(operator);
	}

	@Override
	public void delete(String OperatorID) {
		// TODO Auto-generated method stub
		operatorDAO.delete(OperatorID);
	}

	@Override
	public void update(Operator operator) {
		// TODO Auto-generated method stub
		operatorDAO.update(operator);
	}

	@Override
	public Operator login(String OperatorID, String Password) {
		// TODO Auto-generated method stub
		return operatorDAO.login(OperatorID, Password);
	}

	@Override
	public Operator queryByOperatorID(String OperatorID) {
		// TODO Auto-generated method stub
		return operatorDAO.queryByOperatorID(OperatorID);
	}
}
