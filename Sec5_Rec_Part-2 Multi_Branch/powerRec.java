import java.util.Scanner;

public class powerRec {
// if returning the answer in a integer type

// returning answer at the time of stack falling
  static int computePower(int num,int pow){
     if(pow==1){
        return num;
     }
    //small problem
    int result=computePower(num, pow-1);
   return  result*num;
  }
 //returning solution at the time of stack building
    static void computePower(int num,int pow,int result){
        //Base case
        if(pow==0){
            System.out.println(result);
            return;
        }
        
        //small problem --power ko km kartey jao
        computePower(num, pow-1, num*result);

    }
    public static void main(String[] args) {
        //here we are calling the pow function
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        System.out.println("Enter the power");
        int pow=sc.nextInt();
        
        computePower(num, pow, 1);
        int result =computePower(num, pow);
        System.out.println(result);
        
    }
    
}
