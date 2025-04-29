import java.util.Scanner;

public class factorialRec {
    static int factorialRec(int num ){
        //Base case
        if(num==1){
            return num;

        }
        int factorial=num*factorialRec(num-1);
        return factorial;


    }

    // static void factorialRec(int num ,int result){
    //     //Base case
    //     if(num==1){
    //         System.out.println(result);
    //         return;
    //     }
        
    //     //small problem
    //     factorialRec(num-1, result*num);

    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        //factorialRec(n, 1);
        System.out.println(factorialRec(n));

        
    }
    
}
