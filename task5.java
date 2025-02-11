import java.util.Scanner;
public class task5 {
    public static void main (String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a purchase amount:");
        double amount = object.nextDouble();
        double discount = 0;

        if(amount>=500 && amount<=1000){
            discount = amount * 0.10;
        }else if(amount>1000){
            discount = amount * 0.20;
        }else{
            System.out.println("No discount");
        }

        double finalamount = amount - discount;
        System.out.println("The final payable amount after discount is :" + finalamount);
    }
}
