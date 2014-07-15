package learn.jdbc.service;

import java.util.List;

import learn.jdbc.po.Bank;
import learn.jdbc.po.Operator;

public interface BankService {
	public List<Bank> queryBank();    //遍历信息
	public void delete(String ID);			//删除信息
	public void add(Bank bank);				//添加信息
	public void update(Bank bank);			//修改信息
	public Bank queryByID(String ID);				//根据操作员id查找记录

}
