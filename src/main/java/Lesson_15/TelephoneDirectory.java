package Lesson_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneDirectory {
    private Map<String, List<String>> phoneDirectory = new HashMap<>();

    public void add(String surname, String numder) {
        phoneDirectory.putIfAbsent(surname, new ArrayList<>());
        phoneDirectory.get(surname).add(numder);
    }

    public List<String> get(String surname) {
        return phoneDirectory.get(surname);
    }

    public void printList() {
        for (Map.Entry<String, List<String>> entry : phoneDirectory.entrySet()) {
            System.out.println(entry.getKey() + " " + String.join(" ", entry.getValue()));
        }
    }


}
