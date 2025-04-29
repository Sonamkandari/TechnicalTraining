import java.util.Scanner;

public class code2 {
    public static void printName(int n){
            if(n<=0){
                return;
            }
            System.out.println("sonam");
            printName(n-1);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner (System.in);
            int num=sc.nextInt();
            printName(num);
         
        
    }
}
