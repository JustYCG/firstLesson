package learn.jdbc.DAO;

import java.util.List;
/*
 * 数据库操作接口，增删改查
 */

import learn.jdbc.po.Operator;

public interface OperatorDAO {
	public Operator login(String OperatorID, String Password);				
	public List<Operator> queryAll();    //遍历信息
	public void delete(String OperatorID);			//删除信息
	public void add(Operator Operator);				//添加信息
	public void update(Operator Operator);			//修改信息
	public Operator queryByOperatorID(String OperatorID);				//根据操作员id查找记录

}
