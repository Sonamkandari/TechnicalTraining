import java.util.Scanner;

public class pattern13{
    public static void main(String[] var0) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i = 1; i <= n;i++) {
           for(int j = 1; j <=n;j++) {
            if(j==i||j==1||j==n||i+j==n+1){
              System.out.print("*");
            }else{
                System.out.print(" ");
            }
           }
  
           System.err.println(" ");
        }
  
     }
    
}

