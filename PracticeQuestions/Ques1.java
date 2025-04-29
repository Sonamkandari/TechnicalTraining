import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Value of A:");
        int A=sc.nextInt();
        System.out.println("Value of B:");
        int B=sc.nextInt();
        System.out.println("Value of C:");
        int C=sc.nextInt();
        System.out.println("Value of D:");
        int D=sc.nextInt();
        int greatest=A;
        if(B>greatest){
            greatest=B;
        }
         if(C>greatest){
                greatest=C;
            }
          if(D>greatest){
            greatest=D;
          }  
       
         System.out.println("the largest value:"+greatest); 
        
    }
    
}
