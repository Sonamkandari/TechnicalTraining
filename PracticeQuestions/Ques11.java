import java.util.Scanner;

public class Ques11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        sc.close(); // Close scanner

        // Edge case: If the number is a single digit, no swapping needed
        if (num < 10) {
            System.out.println("Swapped number: " + num);
            return;
        }

        int temp = num;
        int lastDigit = temp % 10;  // Extract last digit
        int firstDigit = 0;
        int digitCount = 0;

        // Extract first digit and count the number of digits
        while (temp > 0) {
            firstDigit = temp;
            temp /= 10;
            digitCount++;
        }

        // Compute the power of 10 to reconstruct the number
        int power = (int) Math.pow(10, digitCount - 1);

        // Remove the first and last digits from num
        int middlePart = num % power;  // Remove first digit
        middlePart = middlePart / 10;  // Remove last digit

        // Construct the swapped number
        int swappedNum = lastDigit * power + middlePart * 10 + firstDigit;

        System.out.println("Swapped number: " + swappedNum);
    }
}
