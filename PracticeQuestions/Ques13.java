import java.util.Scanner;

public class Ques13 {
    public static int rotateNumber(int num, int rotations) {
        int temp = num, digits = 0;

        // Count the number of digits
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        rotations = rotations % digits; // Ensure valid rotation (handle cases where rotations > digits)

        for (int i = 0; i < rotations; i++) {
            int lastDigit = num % 10;  // Extract last digit
            num = num / 10;            // Remove last digit
            num = lastDigit * (int) Math.pow(10, digits - 1) + num; // Append last digit in front
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter number of rotations: ");
        int rotations = scanner.nextInt();
        scanner.close();

        int result = rotateNumber(num, rotations);
        System.out.println("Rotated Number: " + result);
    }
}
