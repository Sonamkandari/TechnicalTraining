import java.util.Scanner;
public class Ques8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int factorCount=0;
        /* 
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factorCount++;
            }
        }
        
        if(factorCount==2){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
     */
    //Optimize approach

    for(int i=2;i*i<=num;i++){
        if(num%i==0){
           System.out.println("not a prime");
           return;
        }    
    }System.out.println("It is a prime number");  
}
}

