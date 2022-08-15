package exo1;

public class Worker extends Officer {
	

	private int tier;

	public Worker(String fullName, int age, String gender, String address, int tier) {
		super(fullName, age, gender, address);
		this.tier = tier;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	@Override
	public String toString() {
		return "Worker [tier=" + tier + ", getFullName()=" + getFullName() + ", getAge()=" + getAge() + ", getGender()="
				+ getGender() + ", getAddress()=" + getAddress() + "]";
	}
	
	

}
