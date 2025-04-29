import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the marks");
        int marks=sc.nextInt();
        if(marks>=90&&marks<=100){
            System.out.println("Grade is: A ");
        }
        if(marks>=80&&marks<=89){
            System.out.println("GRade is: B");
        }
        if(marks>=70&&marks<=79){
            System.out.println("GRade is: C");
        }
        if(marks>=60&&marks<=69){
            System.out.println("GRade is: D");
        }
        if(marks <60){
            System.out.println("Fail");
        }

    }
}
