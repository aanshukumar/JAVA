import java.util.Scanner;

public class sumTillX {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
int sum =0;

    while(true){
            String str = sc.nextLine();

            if(str.equalsIgnoreCase("x")){
                break;
            }
            sum +=Integer.parseInt(str);
    }
    System.out.println(sum);
   }
}
