
import java.util.Scanner;
public class Ques10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
     
        int positionCount=0;
        int sum=0;
        while(num!=0){
            // single digit
        int digit=num%10; //Extract the last digit
        positionCount++;
        if(digit!=0){// to avoid power of 10 issues
        int value=positionCount*(int)Math.pow(10,digit-1);
        sum=sum+value;
            
        }
        num/=10;// remove the last digit
    }
        System.out.println(sum);

        //

    }
    
}

