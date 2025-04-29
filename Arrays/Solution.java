import java.util.Scanner;

class Solution {
    public int countLargestGroup(int n) {

        int[] sums = new int[37];
        for (int i = 1; i <= n; i++) 
        sums[digsum(i)]++;

        int maxi = 0, count = 0;
        for (int i : sums) {
            if (i > maxi) {
                maxi = i;
                count = 1;
            } else if (i == maxi) {
                count++;
            }
        }
        return count;
    }

     private  int digsum(int n){   
     int sum=0;
    while (n > 0) {
            int digit = n % 10; 
            sum += digit;
            n = n / 10; 
        }
        return sum;
     
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        Solution sol = new Solution();
       
        System.out.println("Number of largest groups: " + sol.countLargestGroup(n));
    }
    
}