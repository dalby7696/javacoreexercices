package exo2;

public class Journal extends Document{
	
	private int IssueNumber;
	private int issueMonth;
	
	
	
	public Journal(String id, String publisherName, int issueNumber, int issueNumber2, int issueMonth) {
		super(id, publisherName, issueNumber);
		IssueNumber = issueNumber2;
		this.issueMonth = issueMonth;
	}



	public int getIssueNumber() {
		return IssueNumber;
	}



	public void setIssueNumber(int issueNumber) {
		IssueNumber = issueNumber;
	}



	public int getIssueMonth() {
		return issueMonth;
	}



	public void setIssueMonth(int issueMonth) {
		this.issueMonth = issueMonth;
	}



	@Override
	public String toString() {
		return "Journal [IssueNumber=" + IssueNumber + ", issueMonth=" + issueMonth + ", getId()=" + getId()
				+ ", getPublisherName()=" + getPublisherName() + "]";
	}

	
	
	
}
