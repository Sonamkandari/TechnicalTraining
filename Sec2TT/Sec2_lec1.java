// technical training class notes

//String is a pre Define class java.lang.string
// string is a collection of characters //internally  array ->char[]
//string contains lot of prefine methods
//string use String pool
//String is a final class it can not inherit
public class Sec2_lec1 {
    public static void main(String[] args) {
        
       // StringBuffer sb =new StringBuffer();//Synchronized

        //String  Builder is not synchronized
        StringBuilder sb=new StringBuilder();//prefer more
        // feature capacity
        //default ->length +16 
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("Amit");
        sb.append("srivastava");
        sb.reverse();
        System.out.println(sb.length());
        System.out.println(sb.capacity());


        // length>capacity
        //new capacity =old cap*2+2 // if capacity increases
        //Disadvantage // remoming old value and creating a new using old one 


        //Wrapper class  
        //predefine methods
        // java inbuild data structure work on only on objects Eg LinkedList<integer>=new LinkedList<>();

         int h=10;// store value  capacity is fixed

         Integer h2=10;// reference (object)=data +methods
         byte r=h2.byteValue();
         float tt=h2.floatValue();
         String g=h2.toString();

         //xx value
         //Big types ->example of reference gtype
         // BigIntegers






        


    }
    
}
