import java.util.*;
public class primeOrNot {
    public static void main(String args[] ){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:  ");
    int num = sc.nextInt();
    if(num % 1 == 0 && num % num == 0)
        System.out.println("Prime");
    else
    {
        System.out.println("Not Prime");
    }
}
}
