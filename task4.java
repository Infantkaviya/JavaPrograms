import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int num1 = object.nextInt();
        System.out.println("Enter a second number:");
        int num2 = object.nextInt();
        System.out.println("Enter a third number:");
        int num3 = object.nextInt();

        if (num1<=num2 && num1<=num3) {
            System.out.println("The smallest number is:" + num1);
        } else if (num2<=num1 && num2<=num3) {
            System.out.println("The smallest number is:" + num2);
        } else {
            System.out.println("The smallest number is:" + num3);
        }
    }
}
