import java.util.Scanner;

public class countWord {
    public static void main(String[] args) {
        int count =0;
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            sc.next();
            count++;
        }
        System.out.println("Word"+count);
        sc.close();
        
    }
    
}
