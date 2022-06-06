package assignment7;

import java.util.Objects;

public class Worker extends Person {
	private String workerNo;
	private String department;
	private String position;


	public Worker(){}

	public Worker(String name) {
		super(name);
	}

	public Worker(String name, String workerNo, String department, String position) {
		super(name);
		this.workerNo = workerNo;
		this.department = department;
		this.position = position;
	}

	public String getWorkerNo() {
		return workerNo;
	}
	public void setWorkerNo(String workerNo) {
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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Worker worker = (Worker) o;
		return Objects.equals(workerNo, worker.workerNo) && Objects.equals(department, worker.department) && Objects.equals(position, worker.position);
	}

	@Override
	public String toString() {
		return "Worker{" +
				"name='" + name + '\'' +
				", workerNo='" + workerNo + '\'' +
				", department='" + department + '\'' +
				", position='" + position + '\'' +
				'}';
	}
}
