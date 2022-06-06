package assignment7;

import java.util.Objects;

public class Worker extends Person {
	private int workerNo;
	private String department;
	private String position;
	
	public Worker() {
		super();
	}
	public Worker(int workerNo, String department, String position) {
		super();
		this.workerNo = workerNo;
		this.department = department;
		this.position = position;
	}

	public int getWorkerNo() {
		return workerNo;
	}
	public void setWorkerNo(int workerNo) {
		this.workerNo = workerNo;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", workerNo=" + workerNo + ", department=" + department + ", position=" + position;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(department, other.department) && Objects.equals(position, other.position)
				&& workerNo == other.workerNo;
	}
	
}
