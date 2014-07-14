package learn.jdbc.DAO;

import java.util.List;
/*
 * ���ݿ�����ӿڣ���ɾ�Ĳ�
 */

import learn.jdbc.po.Operator;

public interface OperatorDAO {
	public Operator login(String OperatorID, String Password);				
	public List<Operator> queryAll();    //������Ϣ
	public void delete(String OperatorID);			//ɾ����Ϣ
	public void add(Operator Operator);				//�����Ϣ
	public void update(Operator Operator);			//�޸���Ϣ
	public Operator queryByOperatorID(String OperatorID);				//���ݲ���Աid���Ҽ�¼

}
