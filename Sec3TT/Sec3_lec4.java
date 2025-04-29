import java.util.Scanner;
public class Sec3_lec4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Burger");
        System.out.println("1. Pizza");
        System.out.println("3. Drinks");
        System.out.println("4. Deserts");
        System.out.print("Enter your Choice: ");
        int Choice =sc.nextInt();
        switch (Choice) {
            case 1://Choice ==1
             System.out.println("Rs:100");
             break;//if we will not use a break  statement it will continue falling

            case 2://Choice ==2
            System.out.println("Rs:200");
            break; 
            
            
            case 3://Choice ==3
            System.out.println("Rs:300");
            break;

            case 4://Choice ==4
            System.out.println("Rs:400");
            break;

        
            default:
                break;
        }

    }
}