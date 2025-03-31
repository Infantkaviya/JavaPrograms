package Task5AdvanceJava;

import java.util.*;
import java.util.stream.Stream;

public class UppercaseExample {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        names.map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
