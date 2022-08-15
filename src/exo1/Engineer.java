package exo1;

public class Engineer extends Officer{
	
	
	private String major;

	public Engineer(String fullName, int age, String gender, String address, String major) {
		super(fullName, age, gender, address);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Engineer [major=" + major + ", getFullName()=" + getFullName() + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + ", getAddress()=" + getAddress() + "]";
	}

	 
	
	
	

}
