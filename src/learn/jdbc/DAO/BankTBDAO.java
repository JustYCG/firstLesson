package learn.jdbc.DAO;

import java.util.List;

import learn.jdbc.po.*;

public interface BankTBDAO {
	public List<Bank> queryBank();    //������Ϣ
	public void delete(String OperatorID);			//ɾ����Ϣ
	public void add(Bank bank);				//�����Ϣ
	public void update(Bank bank);			//�޸���Ϣ

}
