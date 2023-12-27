//package Fundamentals;
import java.util.Scanner;
public class All_arithmeticOperation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second no: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2 ;
        System.out.println("SUM = "+ sum);

        int sub = num1 - num2 ;
        System.out.println("DIFFERENCE = "+ sub);

        int mult = num1 * num2;
        System.out.println("PRODUCT = "+ mult);

        int div = num1/num2;
        System.out.println("QUOTIENT = "+ div);

        int mod = num1%num2;
        System.out.println("MODULUS = "+ mod);


    }
    
}
