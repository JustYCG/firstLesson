package learn.jdbc.service;

import java.util.List;

import learn.jdbc.po.Bank;
import learn.jdbc.po.Operator;

public interface BankService {
	public List<Bank> queryBank();    //������Ϣ
	public void delete(String ID);			//ɾ����Ϣ
	public void add(Bank bank);				//�����Ϣ
	public void update(Bank bank);			//�޸���Ϣ
	public Bank queryByID(String ID);				//���ݲ���Աid���Ҽ�¼

}
