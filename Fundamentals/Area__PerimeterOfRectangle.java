//package Fundamentals;
import java.util.Scanner;

public class Area__PerimeterOfRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        int length = sc.nextInt();
        System.out.print("Enter the width : ");
        int width = sc.nextInt();

        int area = length*width;
        System.out.println("Area of Rectangle = "+ area +"sq. units");

        int peri = 2*(length + width);
        System.out.println("Perimeter of Rectangle = "+ peri +" units");


        
    }
    
    
}
