import java.util.Scanner;

public class countWo{
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            sc.nextLine(); // This reads the next word
            count++;
        }
        
        // Print the word count
        System.out.println("Words: " + count);
        
        sc.close(); // Closing the scanner
    }
}
