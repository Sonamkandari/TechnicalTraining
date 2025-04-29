import java.util.Scanner;
  
public class Sumofdigit{
     
    //   Another Approach using return 
  //also call method overloading 
  //method overloading is define as when method name are same but them have different arguments 
   static int Sumofdigit(int num){
    if(num<=0){
        return 0; 
    }
     //small problem
    // int sum=Sumofdigit(num/10);
    // int digits=num%10;
    // sum=sum+digits;
    // return sum;

    // or can be done by this
    return num %10 + Sumofdigit(num/10);

  } 

    // using static keyword so that we don't have to make and object
    // creating an method for sum of digits
    
    static void Sumofdigit(int num,int sum){// main is calling to this function
        if(num<=0){
            System.out.println(sum);
            return;
        }
        int digits=num%10;
        sum=sum+digits;
        Sumofdigit(num/10,sum);//small problem

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        //Sumofdigit(n,0);// main se call lagaya

        System.out.println(Sumofdigit(n));
        
    }


}