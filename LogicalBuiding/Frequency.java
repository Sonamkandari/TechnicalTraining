import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        //key and value both are integer
        HashMap<Integer,Integer>Result=new HashMap<>();
        while(n!=0){
            int digit=n%10;
            if(Result.get(digit)==null){ //get key
              Result.put(digit,1);//put (key,value)

            }else{
                int count=Result.get(digit);
                count++;
                Result.put(digit,count);
            }
            n=n/10;
            

        }
        System.out.println(Result);

    }
}
