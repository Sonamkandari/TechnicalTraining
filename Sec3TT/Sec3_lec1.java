
//command line  argument
public class Sec3_lec1 {// for a class name we always follow pascal case
    public static void main(String[] args) {
       // integer converted int type
        // int firstNumber = Integer.parseInt(args[0]);// declaring variable names we use camel case
        // int secondNumber = Integer.parseInt(args[1]);// if we  not gave value  // array index out of bound error it will gave
        // int result =firstNumber+secondNumber;
        // System.out.println("sum is:"+result);

         int sum =0;// we have to always initialized a local variable in java
         for(int i=0;i<args.length;i++){
            sum=sum+Integer.parseInt(args[i]);

         }
         System.out.println("sum is:"+sum);

    }
    
}
