package exo7;

import java.util.Scanner;

import exo6.Student;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerTeacher managerTeacher = new ManagerTeacher();
        while (true) {
            // show input for user choise
            // 1 to insert
            // 2 to remove => input id. output boolean
            // 4 get salary => input id. output double
            // 5 exit => return
        	
        	System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To add new teacher:");
            System.out.println("Enter 2: To remove: ");
            System.out.println("Enter 3: To Show Food calculation :");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    
                	System.out.print("Enter id:");
                    String id = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age:");
                    int age = scanner.nextInt();
                    System.out.print("Enter hometown: ");
                    scanner.nextLine();
                    String hometown = scanner.nextLine();
                    
                    System.out.print("Enter salary:");
                    Double salary = scanner.nextDouble();
                    
                    System.out.print("Enter bonus:");
                    Double bonus = scanner.nextDouble();
                    
                    System.out.print("Enter penality:");
                    Double penality = scanner.nextDouble();
                    
                    System.out.print("Enter realSalary:");
                    Double realSalary = scanner.nextDouble();
                    
                    Teacher teacher = new Teacher(salary, bonus, penality, realSalary, name, age, hometown, id);
                    managerTeacher.add(teacher);
                    System.out.println(teacher.toString());
                    //scanner.nextLine();
                    
                    break;
                }
                case "2": {
                    System.out.print("Enter id to remove: ");
                    String id = scanner.nextLine();
                    managerTeacher.deleteById(id);
                    break;
                }
                case "3": {
                	System.out.print("Enter id to Calculate Food: ");
                    String id = scanner.nextLine();
                    System.out.println(managerTeacher.getSalary(id));
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
