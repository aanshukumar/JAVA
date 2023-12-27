import java.util.*;
public class area_peri_by_func {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length : ");
    int length = sc.nextInt();
    System.out.print("Enter the width : ");
    int breadth = sc.nextInt();

        int result1 = area(length, breadth);
        System.out.println(result1);

        int result3 = area(length, breadth);
        System.out.println(result3);

        int result2 = peri(length, breadth);
        System.out.println(result2);
   }

   public static int area(int length, int breadth) {
        return length*breadth;
   }
    
   public static int peri(int length, int breadth){
        return (2*(length+breadth));
   }
}