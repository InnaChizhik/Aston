package Lesson_4;

import java.util.ArrayList;
import java.util.List;

public class CollectionStudent {
    private List<Student> students = new ArrayList<>();

    public void addStudents(Student student) {
        students.add(student);

    }

    public void removeStudents() {
        students.removeIf(student -> student.getSrednyGrade() < 3);
    }

    public void perevodStudents() {
        for (Student student : students) {
            student.perevodCourse();
        }
    }

}
