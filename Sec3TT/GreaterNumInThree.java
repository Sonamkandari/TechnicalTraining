import java.util.Scanner;

public class GreaterNumInThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter First Number: ");
        int First=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int second=sc.nextInt();
        System.out.println("Enter Third Number: ");
        int Third=sc.nextInt();
        // int First =345;
        // int second =887;
        // int Third=992;

        if(First>second){
            if(First>Third){
                System.out.println("first is Greater");

            }else{
                System.out.println("Third is Greater");
            }


        }else{
            if(second>Third){
            System.out.println("Second is Greater");
        }else{
            System.out.println("Third is grater");
        }


    }
    
}
}
