package exo1;

public class Employee extends Officer{
	
	private String work;

	 

	

	public Employee(String fullName, int age, String gender, String address, String work) {
		super(fullName, age, gender, address);
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Employee [work=" + work + ", getFullName()=" + getFullName() + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + ", getAddress()=" + getAddress() + "]";
	}

	
	
	
	

}
