import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A :");
        int A=sc.nextInt();
        System.out.println("Enter B :");
        int B =sc.nextInt();
        System.out.println("Enter C :");
        int C =sc.nextInt();

        if((A+B>C )&& (B+C>A) && (C+A>B)){
            System.out.println("valid Triangle");
        }else{
            System.out.println("invalid triangle");
        }
    }
    
}
