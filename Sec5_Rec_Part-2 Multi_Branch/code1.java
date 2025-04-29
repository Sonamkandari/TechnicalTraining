import java.util.Scanner;

public class code1 {

    public void sequence(int N) {
        System.out.print(N); // Print the number without a newline

        if (N == 1) {
            return; // Stop when we reach 1
        }

        int next;
        if (N % 2 == 0) {
            next = N / 2; // If even, divide by 2
        } else {
            next = (3 * N) + 1; // If odd, multiply by 3 and subtract 1
           
        }

        System.out.print(" "); // Print space for formatting
        sequence(next); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        sc.close();

        code1 obj = new code1();
        obj.sequence(N);
    }
}
