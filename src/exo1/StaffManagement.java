package exo1;

import java.util.ArrayList;
import java.util.List;

public class StaffManagement {
	
	
	private List<Officer> officers;

	
	public StaffManagement() {
		this.officers = new ArrayList<>();
	}




	public void addNewStaff(Officer officer) {
		
		this.officers.add(officer);
		
	}


	public void searchByName(String name) {
	this .officers.stream().filter(p -> p.getFullName().equals(name))
    .forEach(System.out::println);
	}
 
	
	
	
	public void displayInfos() {
		
		this.officers.forEach(d->System.out.println(d+""));
	}

}
