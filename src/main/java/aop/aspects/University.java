package aop.aspects;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component("university")
public class University {
    public List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Artem Klucarov", 1, 4.5);
        Student st2 = new Student("Alex Christmas", 1, 0);
        Student st3 = new Student("Kamel Nuriev", 2, 2);
        Collections.addAll(students, st1, st2, st3);
    }

    public List<Student> getStudents(){
        System.out.println("Starts method getStudents()");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents(): ");
        System.out.println(students);
        return students;
    }
}
