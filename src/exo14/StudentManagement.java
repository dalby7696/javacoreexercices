package exo14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentManagement {
	
	private List<Student> students ;

	public StudentManagement() {
		this.students = new ArrayList<>();
	}
	
	
	public void addNewStudent(Student students) {
		this.students.add(students);
		
	}
	
	
	public void searchGSByName(String name) {
		this .students.stream().filter(p -> p.getFullName().equals(name))
	    .forEach(System.out::println);
		}
	
	
	
		public void displayInfos() {
		
			this.students.forEach(d->System.out.println(d+""));
		
			
		}
		
		
//		public void displayByFullname() {
//			 this.students.sort(Comparator.comparing(Student::getFullName).reversed());
//			 this.students.forEach(System.out::println);
//			
//			
//		}
//		
//		
//		public void displayByPhoneNumber() {
//			 this.students.sort(Comparator.comparing(Student::getPhoneNumber));
//			 this.students.forEach(System.out::println);
//			
//			
//		}
		
		
		
		
		public void displayByFullname() {
			this.students.sort(Comparator.comparing(Student::getFullName).reversed());
			displayFullNameAndPhone(this.students);
		}
		
		
		public void displayByPhoneNumber() {
			 this.students.sort(Comparator.comparing(Student::getPhoneNumber));
			displayFullNameAndPhone(this.students);

		}
		
	
		
		
		 private void displayFullNameAndPhone(List<Student> students){
			 List<Student> list=
				 students.stream()
					 .filter(student -> {
						 if(student instanceof  GoodStudent){
							 return student instanceof  GoodStudent;
						 }
						 if(student instanceof  NormalStudent){
							 return student instanceof NormalStudent;
						 }
						 return false;

					 })
					 .collect(Collectors.toList());

			 List<String> strings=list.stream()
				 .map( student -> "Full name: "+ student.fullName+", Phone number: "+student.phoneNumber)
				 .collect(Collectors.toList());

			 System.out.println(strings);
		 }
		
		public long countGoodStudent() {
	        return this.students.stream().filter(s -> s instanceof GoodStudent ).count();
	    }
		
		
		 
}
