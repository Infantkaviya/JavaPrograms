import java.util.Scanner;
public class task3 {
    public static void main (String []args){
       Scanner object = new Scanner(System.in);
       System.out.println("Enter a number:");
       int num = object.nextInt();
       int reversed = 0;
    while (num!=0){
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }
    System.out.println("Reversed number:" + reversed);

    }
}
