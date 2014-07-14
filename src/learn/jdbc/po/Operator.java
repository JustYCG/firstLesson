package learn.jdbc.po;

/*
 *操作员实体类 
 */

import java.io.Serializable;

public class Operator implements Serializable{
	private String BankID;
	private String OperatorID;
	private String SigCod;
	private String Node;
	private int Status;
	private String Permission;
	private String Password;
	private String OperatorName;
	private String Creator;
	private String Checker;
	private String CreateDate;
	private String Reserved;
	private String PID;
	private String name;
	
	public void Operator(){}
	

	public String getPID() {
		return PID;
	}


	public void setPID(String pID) {
		PID = pID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBankID() {
		return BankID;
	}

	public void setBankID(String bankID) {
		BankID = bankID;
	}

	public String getOperatorID() {
		return OperatorID;
	}

	public void setOperatorID(String operatorID) {
		OperatorID = operatorID;
	}

	public String getSigCod() {
		return SigCod;
	}

	public void setSigCod(String sigCod) {
		SigCod = sigCod;
	}

	public String getNode() {
		return Node;
	}

	public void setNode(String node) {
		Node = node;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getPermission() {
		return Permission;
	}

	public void setPermission(String permission) {
		Permission = permission;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getOperatorName() {
		return OperatorName;
	}

	public void setOperatorName(String operatorName) {
		OperatorName = operatorName;
	}

	public String getCreator() {
		return Creator;
	}

	public void setCreator(String creator) {
		Creator = creator;
	}

	public String getChecker() {
		return Checker;
	}

	public void setChecker(String checker) {
		Checker = checker;
	}

	public String getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(String createDate) {
		CreateDate = createDate;
	}

	public String getReserved() {
		return Reserved;
	}

	public void setReserved(String reserved) {
		Reserved = reserved;
	}

	
	};
	
