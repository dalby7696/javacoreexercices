package exo14;

import java.util.Scanner;
import java.util.regex.*;

 


public class Main {
	
	
	
	public static boolean isValidMobileNo(String str)  
	{  
	//(0/91): number starts with (0/91)  
	//[7-9]: starting of the number may contain a digit between 0 to 9  
	//[0-9]: then contains digits 0 to 9  
	Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");  
	//the matcher() method creates a matcher that will match the given input against this pattern  
	Matcher match = ptrn.matcher(str);  
	//returns a boolean value  
	return (match.find() && match.group().equals(str));  
	}  
	
	
	public static void phoneCheck(String phone) throws InvalidPhoneNumberException  {
        if (!phone.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")){
           throw new InvalidPhoneNumberException("Phone number format is incorrect");
        }
    }
  
    
    
    static void validate (String nom) throws InvalidFullNameException  {    
    	String regex="^[a-zA-Z\\s]*$";
          
        if((nom.length() < 10 ) || (nom.length()>50) ) {
        	
        	throw new InvalidFullNameException("Name exceed the number of characters");
        	
        }
       
          
      } 

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           
        StudentManagement StudentManagement = new StudentManagement();
        
        while (true) {
            System.out.println("Application Manager Student");
            System.out.println("Enter 1: To add new good student:");
            System.out.println("Enter 2: To add new normal student:");
            System.out.println("Enter 3: To display the full name and phone number of all students:");
            System.out.println("Enter 4: To display  all students:");
            System.out.println("Enter 5: To enter the number of students to recruit:");   
            System.out.println("Enter 6: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    
                    
                    
                    System.out.print("Enter date of birth");
                    String dob = scanner.nextLine();
                    System.out.print("Enter sex");      
                    String sex  = scanner.nextLine();
                     
                    
                    System.out.print("Enter phone number");
                    String phone = scanner.nextLine();
                    System.out.print("Enter university name"); 
                    String un = scanner.nextLine();
                   System.out.print("Enter grade level");                 
                    String  gl  = scanner.nextLine();
                    
                    System.out.print("Enter gpa ");
                    int gpa = scanner.nextInt();
                    System.out.print("Enter best reward name");
                    String brn = scanner.nextLine();
                    
                    Student goodStudent = new GoodStudent(name, dob, sex, phone, un, gl, gpa, brn);
                    StudentManagement.addNewStudent(goodStudent);
                    System.out.println(goodStudent.toString());
                    //scanner.nextLine();
                    
                    break;
                }
                case "2": {
                	String name = "";
                	String phone ="";
                	
                	do
                	{
                	
                    System.out.print("Enter name: ");
                     
                    try {
						validate(name = scanner.nextLine());
					} catch (InvalidFullNameException e) {
						// TODO Auto-generated catch block
						 System.out.println("Name exceed the number of characters");
					}
                	
                	}while((name.length()<10) || (name.length()>50));
						 
                 
                    System.out.print("Enter date of birth");
                    String dob = scanner.nextLine();
                    System.out.print("Enter sex");      
                    String sex  = scanner.nextLine();
                    
                    Matcher matcher;
                    String regex;
                    
                   
                    System.out.print("Enter phone number");
                     phone = scanner.nextLine();
                    
                    
                    
                  //Regular expression to accept valid phone number
                   regex = "^[0-9]{10}$";
                    //Creating a pattern object
                    Pattern pattern = Pattern.compile(regex);
                    //Creating a Matcher object
                     matcher = pattern.matcher(phone);
                    //Verifying whether given phone number is valid
                    if(matcher.matches()) {
                       System.out.println("Given phone number is valid");
                    } else { 
                       System.out.println("Given phone number is not valid");
                      
                    }
                    	 
                    
                    System.out.print("Enter university name"); 
                    String un = scanner.nextLine();
                    System.out.print("Enter grade level");                 
                    String  gl  = scanner.nextLine();
                    
                    System.out.print("Enter englishScore ");  
                    double englishScore = scanner.nextDouble();
                    System.out.print("Enter entryTestScoree");
                    int entryTestScore = scanner.nextInt();
              
                    Student normalStudent = new NormalStudent(name, dob, sex, phone, un, gl, englishScore, entryTestScore);
                     StudentManagement.addNewStudent(normalStudent);
                    System.out.println(normalStudent.toString());
                    break;
                }
                case "3": {
                	 System.out.println("Enter a: to sort by FullName");
	                    System.out.println("Enter b: to sort by Phone number");
	                    String type = scanner.nextLine();
	                    switch (type) {
                        case "a": {
                        	 StudentManagement.displayByFullname();
                        	break;
                        }
                        case "b":{
                        	 StudentManagement.displayByPhoneNumber();
                        	break;
                        }   
                        }
	                    break;
	                    }
                case "4": {
                			 StudentManagement.displayInfos();
               	 
	                    break;
	                    }
                case "5": {
                	 System.out.print("Enter  the number of students to recruit ");
                     int numberOfStudent = scanner.nextInt();
        			 long numberOfGoodStudent=  StudentManagement.countGoodStudent();
        			 
        			 if (numberOfGoodStudent > numberOfStudent) {
        				 
        				  
        				 
        			 }
       	 
                break;
                }
                case "6": {
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
