package learn.jdbc.service;

/*
 * �����ӿ�
 */

import java.util.List;
import learn.jdbc.po.Operator;

public interface OperatorService {
	public Operator login(String OperatorID, String Password);
	public List<Operator> queryAll();		//��������
	public void delete(String OperatorID);				//ɾ������
	public void add(Operator operator);//��Ӳ���
	public void update(Operator operator);//���²���
	public Operator queryByOperatorID(String OperatorID);				//���ݲ���Աid���Ҽ�¼

}
