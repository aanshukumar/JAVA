import java.util.Scanner;
public class multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int n = sc.nextInt();
        {
            for(int i=1; i<=10; i++){
            int t = n*i;
            System.out.println(t);
            }
        }
  }
 }