package Task5AdvanceJava;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you birthdate (yyyy-mm-dd) : ");
        String birthdateInput = scanner.nextLine();
        scanner.close();

        LocalDate birthdate = LocalDate.parse(birthdateInput);
        LocalDate currentdate = LocalDate.now();

        Period age = Period.between(birthdate, currentdate);

        System.out.println("Your age is " + age.getYears() + " years, " + age.getMonths() + "months, " +
                age.getDays() + "days ");

    }

}
