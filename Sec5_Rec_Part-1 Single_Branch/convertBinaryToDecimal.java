import java.util.Scanner;

public class convertBinaryToDecimal {

    public static int convertBinaryToDecimal(int num, int power) {
        // Base case: If the number is 0, return 0
        if (num == 0) {
            return 0;
        }

        // Extract the last digit
        int digit = num % 10;

        // Multiply by 2^power using bitwise shift instead of Math.pow()
        return (digit * (1 << power)) + convertBinaryToDecimal(num / 10, power + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int num = sc.nextInt();
        sc.close(); // Close scanner to prevent memory leaks

        // Call the function with initial power = 0
        int decimalValue = convertBinaryToDecimal(num, 0);

        System.out.println("Decimal equivalent: " + decimalValue);
    }
}
