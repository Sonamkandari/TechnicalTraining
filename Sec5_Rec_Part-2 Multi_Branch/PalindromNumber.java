import java.util.Scanner;

public class PalindromNumber {
    // Method to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int copy = num; // Store original number
        
        while (num > 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        
        // Compare reversed number with the original number
        return copy == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        // Call the palindrome method and print result
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }
        
        sc.close(); // Close scanner to avoid memory leak
    }
}
