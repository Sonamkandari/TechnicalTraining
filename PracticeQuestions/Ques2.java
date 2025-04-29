import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        long year=sc.nextLong();
        if((year%4==0 && year/100!=0)||year%400==0){
            System.out.println("Yes the year is leap year");
        }else{
            System.out.println("not a leap year");
        }
        
    }
    
}
