import java.util.*;
public class oddEvenCheck {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number: ");
     int num = sc.nextInt();
     if(num%2==0)
      System.out.println(num + " is a Even Number.");
      else 
      {
        System.out.println(num + " is a Odd Number.");
      }
    }
}
