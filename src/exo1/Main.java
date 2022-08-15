package exo1;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		StaffManagement management = new StaffManagement();
		
		
		 while (true) {
	            System.out.println("Application Manager Officer");
	            System.out.println("Enter 1: To insert officer");
	            System.out.println("Enter 2: To search officer by name: ");
	            System.out.println("Enter 3: To Display information officers");
	            System.out.println("Enter 4: To exit:");
	            String line = scanner.nextLine();
	            switch (line) {
	                case "1": {
	                    System.out.println("Enter a: to insert Enginner");
	                    System.out.println("Enter b: to insert Worker");
	                    System.out.println("Enter c: to insert Employee");
	                    String type = scanner.nextLine();
	                    switch (type) {
	                        case "a": {
	                            System.out.print("Enter name: ");
	                            String name = scanner.nextLine();
	                            System.out.print("Enter age:");
	                            int age = scanner.nextInt();
	                            System.out.print("Enter gender: ");
	                            scanner.nextLine();
	                            String gender = scanner.nextLine();
	                            System.out.print("Enter address: ");
	                            String address = scanner.nextLine();
	                            System.out.print("Enter major: ");
	                            String major = scanner.nextLine();
	                            Officer engineer = new Engineer(name, age, gender, address, major);
	                            management.addNewStaff(engineer);
	                            System.out.println(engineer.toString());
	                            break;

	                        }
	                        
	                        case "b": {
	                            System.out.print("Enter name: ");
	                            String name = scanner.nextLine();
	                            System.out.print("Enter age:");
	                            int age = scanner.nextInt();
	                            System.out.print("Enter gender: ");
	                            scanner.nextLine();
	                            String gender = scanner.nextLine();
	                            System.out.print("Enter address: ");
	                            String address = scanner.nextLine();
	                            System.out.print("Enter tier: ");
	                            int tier = scanner.nextInt();
	                            Officer worker = new Worker(name, age, gender, address, tier);
	                            management.addNewStaff(worker);
	                            System.out.println(worker.toString());
	                            scanner.nextLine();
	                            break;
	                        }
	                        case "c": {
	                            System.out.print("Enter name: ");
	                            String name = scanner.nextLine();
	                            System.out.print("Enter age: ");
	                            int age = scanner.nextInt();
	                            System.out.print("Enter gender: ");
	                            scanner.nextLine();
	                            String gender = scanner.nextLine();
	                            System.out.print("Enter address: ");
	                            String address = scanner.nextLine();
	                            System.out.print("Enter work: ");
	                            String work = scanner.nextLine();
	                            Officer employee = new Employee(name, age, gender, address, work);
	                            management.addNewStaff(employee);
	                            System.out.println(employee.toString());
	                            break;
	                        }
//	                         
	                        default:
	                            System.out.println("Invalid");
	                            break;
	                    }
	                    break;
	                }
	                case "2": {
	                    System.out.print("Enter name to search: ");
	                    String name = scanner.nextLine();
	                    management.searchByName(name);
	                    break;
	                }
	                case "3": {
	                	management.displayInfos();
	                    break;
	                }
	                case "4": {
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
