package Lesson_4;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CollectionStudent studentCollection = new CollectionStudent();
        studentCollection.addStudents(new Student("Артур", 202, 2, Map.of("Алгебра ", 8, "История", 9, "Геометрия ", 9)));
        studentCollection.addStudents(new Student("Павел", 202, 2, Map.of("Алгебра ", 7, "История", 7, "Геометрия ", 7)));
        studentCollection.addStudents(new Student("Иван", 202, 2, Map.of("Алгебра ", 1, "История", 2, "Геометрия ", 3)));
        studentCollection.addStudents(new Student("Мария", 202, 1, Map.of("Алгебра ", 9, "История", 8, "Геометрия ", 8)));
        studentCollection.printStudents(2);
    }
}
