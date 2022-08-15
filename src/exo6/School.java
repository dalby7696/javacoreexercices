package exo6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudent20YearOld() {
        return this.students.stream().filter(s -> s.getAge() == 20).collect(Collectors.toList());
        
    }

    public long countStudent23YearOldInDN() {
        return this.students.stream().filter(s -> s.getAge() == 23 && s.getHometown().equals("DN")).count();
    }
}
