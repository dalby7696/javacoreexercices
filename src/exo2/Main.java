package exo2;

import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DocumentManagement documentManagement = new DocumentManagement();
	        while (true) {
	            System.out.println("Application Manager Document");
	            System.out.println("Enter 1: To insert document");
	            System.out.println("Enter 2: To search document by category: ");
	            System.out.println("Enter 3: To display information documents");
	            System.out.println("Enter 4: To remove document by id");
	            System.out.println("Enter 5: To exit:");
	            String line = scanner.nextLine();
	            switch (line) {
	                case "1": {
	                    System.out.println("Enter a: to insert Book");
	                    System.out.println("Enter b: to insert Newspaper");
	                    System.out.println("Enter c: to insert Journal");
	                    String type = scanner.nextLine();
	                    switch (type) {
	                        case "a": {
	                            System.out.print("Enter ID: ");
	                            String id = scanner.nextLine();
	                            System.out.print("Enter publisherName:");
	                            String publisherName = scanner.nextLine();
	                            System.out.print("Enter issueNumber: ");
	                            int issueNumber = scanner.nextInt();
	                            System.out.print("Enter author: ");
	                            scanner.nextLine();
	                            String author = scanner.nextLine();
	                            System.out.print("Enter page number: ");
	                            int pageNumber = scanner.nextInt();
	                            Document book = new Book(id, publisherName, issueNumber, author, pageNumber);
	                            documentManagement.addDocument(book);
	                            System.out.println(book.toString());
	                            scanner.nextLine();
	                            break;

	                        }
	                        case "b": {
	                            System.out.print("Enter ID: ");
	                            String id = scanner.nextLine();
	                            System.out.print("Enter publisherName:");
	                            String publisherName = scanner.nextLine();
	                            System.out.print("Enter issueNumber: ");
	                            int issueNumber = scanner.nextInt();
	                            System.out.print("Enter Day issue: ");
	                            int dayIssue = scanner.nextInt();
	                            Document newspaper = new Newspaper(id, publisherName, issueNumber, dayIssue);
	                            documentManagement.addDocument(newspaper);
	                            System.out.println(newspaper.toString());
	                            scanner.nextLine();
	                            break;
	                        }
	                        case "c": {
	                            System.out.print("Enter ID: ");
	                            String id = scanner.nextLine();
	                            System.out.print("Enter publisherName:");
	                            String publisherName = scanner.nextLine();
	                            System.out.print("Enter number: ");
	                            int number = scanner.nextInt();
	                            System.out.print("Enter issue number : ");
	                            int issueNumber = scanner.nextInt();
	                            System.out.print("Enter issue month : ");
	                            int issueMonth = scanner.nextInt();
	                            Document journal = new Journal(id, publisherName, number, issueNumber, issueMonth);
	                            documentManagement.addDocument(journal);
	                            System.out.println(journal.toString());
	                            scanner.nextLine();
	                            break;
	                        }
	                        	                        
	                        default:
	                            break;
	                    }
	                    break;
	                }
	                case "2": {
	                    System.out.println("Enter a to search book");
	                    System.out.println("Enter b to search newspaper");
	                    System.out.println("Enter c to search journal");
	                    String choise = scanner.nextLine();
	                    switch (choise) {
	                        case "a": {
	                        	documentManagement.searchByBook();
	                            break;
	                        }
	                        case "b": {
	                        	documentManagement.searchByNewspaper();
	                            break;
	                        }
	                        case "c":
	                        	documentManagement.searchByJournal();
	                            break;
	                        default:
	                            System.out.println("Invalid");
	                            break;
	                    }
	                    break;
	                }
	                case "3": {
	                	documentManagement.displayInfo();;
	                    break;
	                }
	                case "4": {
	                    System.out.print("Enter id to remove: ");
	                    String id = scanner.nextLine();
	                    documentManagement.deleteDocument(id);
	                }
	                break;
	                case "5": {
	                     System.exit(0);
	                     System.out.flush();
	                }
	                default:
	                    System.out.println("Invalid");
	                    continue;
	            }

	        }
	    }

}
