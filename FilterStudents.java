package Task5AdvanceJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStudents {
    public static void main(String[] args) {
        List<String> studentsNames = Arrays.asList("Aruna", "Sana", "Johans", "Wilson", "Ajay", "Arjun", "Subi", "Daniel", "Jancy", "Anjali");
        List<String> filteredStudents = studentsNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students whose name start with 'A'" + filteredStudents);
    }

}
