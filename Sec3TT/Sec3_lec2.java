import java.util.Scanner;

public class Sec3_lec2 {
    public static void main(String[] args) throws Exception{
      
        //but by using this we are unable to know the end of input it is contiguously taking input
        
        // byte arr[]=System.in.readAllBytes();// if we will not use throws exception the code will not run
        // System.out.println(arr);


        //we need a character which gave us end of input also

        /*int x=System.in.read();// reading mechanism is not working
        System.out.println(x);//output --> ASCII value of a 65  */

          // we use a buffer because our input is very slow and  cpu is very fast so we need a buffer

          Scanner sc=new Scanner(System.in);//System .in (take input and stored it in the buffer)
          System.out.println("Enter Your ID:");
          int ID=sc.nextInt();
          String name = sc.nextLine();// we will not able to enter the name  ** next line is working as /n
          System.out.println("Your name is:");
          //sc.nextLine();// by using this we are able to  write name
          sc.close();// closing the buffer after using it  ** good practice of code
  

    }

    
}
