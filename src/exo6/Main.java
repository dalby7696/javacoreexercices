package exo6;

import java.util.Scanner;

import exo1.Employee;
import exo1.Engineer;
import exo1.Officer;
import exo1.Worker;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        School school = new School();

        // add Student to school by func add(). for ex: school.add(new Student(// infor);

       // school.getStudent20YearOld();

       // school.countStudent23YearOldInDN();
        
        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To add new students:");
            System.out.println("Enter 2: To Displays 20-year-old students: ");
            System.out.println("Enter 3: To Show the number of students whose age is 23 and their hometown in DN:");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age:");
                    int age = scanner.nextInt();
                    System.out.print("Enter hometown: ");
                    scanner.nextLine();
                    String hometown = scanner.nextLine();
                    Student student = new Student(name, age, hometown);
                    school.add(student);
                    System.out.println(student.toString());
                    //scanner.nextLine();
                    
                    break;
                }
                case "2": {
//                    System.out.print("Enter name to search: ");
//                    String name = scanner.nextLine();
                	 System.out.println( school.getStudent20YearOld());
                    break;
                }
                case "3": {
                	 System.out.println("Number of Student =: "+school.countStudent23YearOldInDN());
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
