import java.util.Scanner;

public class sumOfNnaturalNums {
    static int sumOfNnaturalNums(int range){
        if(range==0){
            return 0;
        }

        // small problems
        int sum=range+sumOfNnaturalNums(range-1);
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int range=sc.nextInt();
        int result = sumOfNnaturalNums(range);
        System.out.println("Sum is:"+result);

    }
    
}
