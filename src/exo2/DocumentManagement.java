package exo2;

import java.util.ArrayList;
import java.util.List;

public class DocumentManagement {
	
	List<Document> documents = new  ArrayList<>();

	public DocumentManagement( ) {
		 
		this.documents = new ArrayList<>();
	}

	 
	
	
	public void addDocument(Document document) {
		this.documents.add(document);
	}
	
	
	public void deleteDocument(String id) {
		this.documents.removeIf(d -> d.getId().equals(id));
		this.documents.forEach(System.out::println);
		
	}
	
	
	public void displayInfo() {
		this.documents.forEach(d ->System.out.println(d.toString()));
	}
	
	
	 public void searchByBook() {
	        this.documents.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
	    }

	    public void searchByNewspaper() {
	        this.documents.stream().filter(doc -> doc instanceof Newspaper).forEach(doc -> System.out.println(doc.toString()));
	    }

	    public void searchByJournal() {
	        this.documents.stream().filter(doc -> doc instanceof Journal).forEach(doc -> System.out.println(doc.toString()));
	    }

}
