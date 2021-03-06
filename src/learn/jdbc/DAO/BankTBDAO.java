package learn.jdbc.DAO;

import java.util.List;

import learn.jdbc.po.*;

public interface BankTBDAO {
	public List<Bank> queryBank();    //遍历信息
	public void delete(String ID);			//删除信息
	public void add(Bank bank);				//添加信息
	public void update(Bank bank);			//修改信息
	public Bank queryByID(String ID);				//根据行号查找记录

}
