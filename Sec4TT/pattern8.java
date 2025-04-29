
import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int i,s;
        for ( i = 1; i <= n; i++) {
            for ( s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // print odd
            int odd=2*i-1;
            for (int j = 1; j <= odd; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

           for(i=n-1;i>0;i--){
            for(s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            int odd=2*i-1;
           
            for (int j = 1; j <= odd; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}

