//package Fundamentals;

import java.util.Scanner;

public class Dia_Cur_Areaofcircle {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the radius of circle : ");
    int radius = sc.nextInt();

    int dia = 2*radius;
    System.out.println("DIAMETER = "+ dia+ " units");

    int cur = 2*22/7*radius;
    System.out.println("CIRCUMFERENCE = "+ cur+ " units");

    int area = 22/7*radius*radius;
    System.out.println("AREA = "+ area+ "sq.units");
}    
}
