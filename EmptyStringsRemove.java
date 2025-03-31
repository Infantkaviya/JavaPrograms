package Task5AdvanceJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyStringsRemove {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filteredList = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println(filteredList);
    }

}
