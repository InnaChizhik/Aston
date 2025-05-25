package Lesson_15;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CollectionStudent studentCollection = new CollectionStudent();
        studentCollection.addStudents(new Student("Артур", 202, 2, Map.of("Алгебра ", 8, "История", 9, "Геометрия ", 9)));
        studentCollection.addStudents(new Student("Павел", 202, 2, Map.of("Алгебра ", 7, "История", 7, "Геометрия ", 7)));
        studentCollection.addStudents(new Student("Иван", 202, 2, Map.of("Алгебра ", 1, "История", 2, "Геометрия ", 1)));
        studentCollection.addStudents(new Student("Мария", 202, 1, Map.of("Алгебра ", 9, "История", 8, "Геометрия ", 8)));
        studentCollection.printStudents(2);
        studentCollection.perevodStudents();
        studentCollection.printStudents(2);
        studentCollection.removeStudents();
        studentCollection.printStudents(2);
        TelephoneDirectory phoneDirectory = new TelephoneDirectory();
        phoneDirectory.add("Орлова", "+375291220344");
        phoneDirectory.add("Орлова", "+375291220900");
        phoneDirectory.add("Анисимов", "+375336520900");
        phoneDirectory.printList();
        phoneDirectory.get("Орлова");

    }
}
