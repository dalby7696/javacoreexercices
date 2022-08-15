package exo14;

public class GoodStudent extends Student{
	
	private int gpa;
	private String bestRewardName;
	
	
	
	public GoodStudent() {
		super();
	}
	
	public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
			String gradeLevel, int gpa, String bestRewardName) {
		super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
		this.gpa = gpa;
		this.bestRewardName = bestRewardName;
	}





	





	











	public int getGpa() {
		return gpa;
	}





	public void setGpa(int gpa) {
		this.gpa = gpa;
	}





	public String getBestRewardName() {
		return bestRewardName;
	}





	public void setBestRewardName(String bestRewardName) {
		this.bestRewardName = bestRewardName;
	}





	@Override
	public String toString() {
		return "GoodStudent [gpa=" + gpa + ", bestRewardName=" + bestRewardName + ", fullName=" + fullName + ", doB="
				+ doB + ", sex=" + sex + ", phoneNumber=" + phoneNumber + ", universityName=" + universityName
				+ ", gradeLevel=" + gradeLevel + "]";
	}





	@Override
	void ShowMyInfor() {
		System.out.println("GoodStudent");
		
	}
	
	
	
	

}
