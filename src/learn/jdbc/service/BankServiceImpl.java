package learn.jdbc.service;

import java.util.List;

import learn.jdbc.po.Bank;
import learn.jdbc.DAO.*;

public class BankServiceImpl implements BankService {
	private BankTBDAO bankDAO=new BankTBDAOImpl();
	@Override
	public void add(Bank bank) {
		// TODO Auto-generated method stub
		bankDAO.add(bank);
	}

	@Override
	public void delete(String ID) {
		// TODO Auto-generated method stub
		bankDAO.delete(ID);
	}

	@Override
	public List<Bank> queryBank() {
		// TODO Auto-generated method stub
		return bankDAO.queryBank();
	}

	@Override
	public void update(Bank bank) {
		// TODO Auto-generated method stub
		bankDAO.update(bank);
	}

	@Override
	public Bank queryByID(String ID) {
		// TODO Auto-generated method stub
		return bankDAO.queryByID(ID);
	}

}
