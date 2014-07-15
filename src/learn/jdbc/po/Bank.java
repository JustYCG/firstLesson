package learn.jdbc.po;

import java.io.Serializable;

public class Bank implements Serializable{
	private String ID;
	private String PID;
	private String Name;
	private String Level;
	private String GID;
	private String Status;
	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	private String Reserved;
	
	public void Bank(){}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPID() {
		return PID;
	}

	public void setPID(String pID) {
		PID = pID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}

	public String getGID() {
		return GID;
	}

	public void setGID(String gID) {
		GID = gID;
	}

	public String getReserved() {
		return Reserved;
	}

	public void setReserved(String reserved) {
		Reserved = reserved;
	};
	

}
