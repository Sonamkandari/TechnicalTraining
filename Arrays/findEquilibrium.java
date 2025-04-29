import java.util.Scanner;
public class findEquilibrium {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int Totalsum=0;
        for(int elements:arr){
            Totalsum+=elements; 
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            int rightSum =Totalsum-leftSum-arr[i]; 
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of elements inserted");
       int n=sc.nextInt();
      
       int []arr=new int[n];
       System.out.println("Enter elements:");
       for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
    }
       int result= findEquilibrium(arr);

       if (result != -1) {
        System.out.println("Equilibrium index found at position: " + result);
    } else {
        System.out.println("No equilibrium index found.");
    }
    }
}
