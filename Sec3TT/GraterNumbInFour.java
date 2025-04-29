import java.util.Scanner;

public class GraterNumbInFour {
    public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
        System.out.println("Enter First Number: ");
        int First=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int second=sc.nextInt();
        System.out.println("Enter Third Number: ");
        int Third=sc.nextInt();
        System.out.println("Enter Fourth Number: ");
        int Fourth=sc.nextInt();

        // int First =345;
        // int second =887;
        // int Third=992;
        //int Fourth=086;

        if(First>Fourth){
            if(First>Third){
                if(First>second){
                    System.out.println("first is greater");
                }else{
                    System.out.println("Second is Greater");
                }
            }else{
                if(Third>second){
                    System.out.println("Third is greater");
                }else{
                    System.out.println(" second is greater ");
                }
            }
        }else{
            if(Fourth>Third){
                System.out.println("fourth is Greater");
            }else{
                System.out.println("Third is Greater");
            }
        }
    }
    
}
