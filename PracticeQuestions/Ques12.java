import java.util.Scanner;

public class Ques12{
    public static int findRotationCycle(int num) {
        int original = num;
        int temp = num, digits = 0, count = 0;

        // Count number of digits
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        do {
            int lastDigit = num % 10;  // Extract last digit
            num = num / 10;            // Remove last digit
            num = lastDigit * (int) Math.pow(10, digits - 1) + num; // Append last digit in front
            count++; // Increase rotation count

        } while (num != original); // Stop when it becomes the original number

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int cycles = findRotationCycle(num);
        System.out.println("Rotations required to get the original number: " + cycles);
    }
}
