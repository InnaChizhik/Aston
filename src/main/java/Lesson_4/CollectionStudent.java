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

    public void printStudents(int course) {
        System.out.println("Студенты " + course + "курса: ");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }


}
