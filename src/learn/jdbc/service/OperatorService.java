package learn.jdbc.service;

/*
 * 操作接口
 */

import java.util.List;
import learn.jdbc.po.Operator;

public interface OperatorService {
	public Operator login(String OperatorID, String Password);
	public List<Operator> queryAll();		//遍历操作
	public void delete(String OperatorID);				//删除操作
	public void add(Operator operator);//添加操作
	public void update(Operator operator);//更新操作
	public Operator queryByOperatorID(String OperatorID);				//根据操作员id查找记录

}
