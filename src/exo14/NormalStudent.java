package exo14;

public class NormalStudent extends Student {
	
	private double englishScore;
	private int entryTestScore;
	
	
	
	public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
			String gradeLevel, double englishScore, int entryTestScore) {
		super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
		this.englishScore = englishScore;
		this.entryTestScore = entryTestScore;
	}



	public double getEnglishScore() {
		return englishScore;
	}



	public void setEnglishScore(double englishScore) {
		this.englishScore = englishScore;
	}



	public int getEntryTestScore() {
		return entryTestScore;
	}



	public void setEntryTestScore(int entryTestScore) {
		this.entryTestScore = entryTestScore;
	}



	@Override
	public String toString() {
		return "NormalStudent [englishScore=" + englishScore + ", entryTestScore=" + entryTestScore + ", fullName="
				+ fullName + ", doB=" + doB + ", sex=" + sex + ", phoneNumber=" + phoneNumber + ", universityName="
				+ universityName + ", gradeLevel=" + gradeLevel + "]";
	}



	@Override
	void ShowMyInfor() {
		System.out.println("NormalStudent");
		
	}
	
	
	
	

}
