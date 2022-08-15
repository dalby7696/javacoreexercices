package exo2;

public class Document {
	
	private String id;
	
	private String publisherName;
	
	private int issueNumber;

	public Document(String id, String publisherName, int issueNumber) {
		super();
		this.id = id;
		this.publisherName = publisherName;
		this.issueNumber = issueNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}
	
	
	

}
