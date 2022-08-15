package exo2;

public class Newspaper extends Document {

	
	private int DateOfIssue;

	public Newspaper(String id, String publisherName, int issueNumber, int dateOfIssue) {
		super(id, publisherName, issueNumber);
		DateOfIssue = dateOfIssue;
	}

	public int getDateOfIssue() {
		return DateOfIssue;
	}

	public void setDateOfIssue(int dateOfIssue) {
		DateOfIssue = dateOfIssue;
	}

	@Override
	public String toString() {
		return "Newspaper [DateOfIssue=" + DateOfIssue + ", getId()=" + getId() + ", getPublisherName()="
				+ getPublisherName() + ", getIssueNumber()=" + getIssueNumber() + "]";
	}
	
	
	
	
}
