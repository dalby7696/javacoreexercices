package exo2;

public class Book extends Document {
	
	private String authorNmae;
	
	private int pageNumber;

	public Book(String id, String publisherName, int issueNumber, String authorNmae, int pageNumber) {
		super(id, publisherName, issueNumber);
		this.authorNmae = authorNmae;
		this.pageNumber = pageNumber;
	}

	public String getAuthorNmae() {
		return authorNmae;
	}

	public void setAuthorNmae(String authorNmae) {
		this.authorNmae = authorNmae;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	@Override
	public String toString() {
		return "Book [authorNmae=" + authorNmae + ", pageNumber=" + pageNumber + ", getId()=" + getId()
				+ ", getPublisherName()=" + getPublisherName() + ", getIssueNumber()=" + getIssueNumber() + "]";
	}
	
	
	

}
