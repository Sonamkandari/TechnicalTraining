public class Demo {

   // # can we change signature of main -->yes

    // can we make more than one main in java single class
     // yes with the help of overloading we can make more than 1 main  class in a single class  -->
public static void main(){
    System.out.println("my main");
}

public static void main(int x){
     x=15;
    System.out.println("main for:"+x);

}

    public static void main(String[] args) {
        main();
        main(10);
        System.out.println("hello");//print in new line
        System.out.print("hello");// print in same line
        
    }
    
}
