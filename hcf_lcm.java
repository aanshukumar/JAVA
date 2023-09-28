import java.util.Scanner;

class h24cf_lcm {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number:  ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number:  ");
    int num2 = sc.nextInt();

    while(num2!=0){
        int hcf = num2;
        num2= num1%num2;
        num1=hcf;
    }
    System.out.println(num1);
    }
}
