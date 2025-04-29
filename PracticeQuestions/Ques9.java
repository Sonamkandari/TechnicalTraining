
import java.util.Scanner;
public class Ques9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int copy=num;
        int count=0;
        while(num>0){
        num=num/10;// make num small
        count++;
        
        }
        num=copy;
        int pow=(int)Math.pow(10,count-1);
        while(num!=0){
            System.out.println(num/pow);
            // this is used to make the number small
            num=num%pow;
            // this is used here to make the power small
            pow=pow/10;
        }

    }
    
}

