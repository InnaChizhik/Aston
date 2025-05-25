package Lesson_4;

import java.util.Map;

public class Student {
    private String name;
    private int group;
    private int course;
    private Map<String, Integer> rating;

    public Student(String name, int group, int course, Map<String, Integer> rating) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rating = rating;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public double getSrednyGrade() {
        if (rating.isEmpty()) return 0;
        int sum = 0;
        for (int grade : rating.values()) {
            sum += grade;
        }
        return (double) sum / rating.size();
    }

    public void perevodCourse() {
        if (getSrednyGrade() >= 3) {
            course++;
        }
    }

    public String toString() {
        return name + ", группа =" + group + ", курс=" + course + ", средний балл = " + getSrednyGrade();
    }
}
