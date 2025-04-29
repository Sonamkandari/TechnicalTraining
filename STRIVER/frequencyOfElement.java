import java.util.Scanner;

public class frequencyOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements");
        int  n=sc.nextInt();
        System.out.println("Enter the elements");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the frequency");
        int[]hash=new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]= hash[arr[i]]+1;
        }
        System.out.println("print how many time num appears");
        int q;
        q=sc.nextInt();
        while(q--!=0){
            int number;
            number=sc.nextInt();
            System.out.println(hash[number]);
        }
    }
    
}
