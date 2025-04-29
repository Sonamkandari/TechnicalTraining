import java.util.Scanner;

public class numOfZeroes {
    public static int countZeroes(int num, int count){
        //base case
        if(num==0){
            return count ;
        }
        int digits=num%10;
        if(digits==0){
            count++;
        }
        // small problem
       return countZeroes(num/10,count);

    }
    public static void main(String[] args) {
        // numOfZeroes myobj=new numOfZeroes();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int result =(num==0)? 1:countZeroes(num,0);
        System.out.println("Number of zeroes: " + result);

    }
    
}
