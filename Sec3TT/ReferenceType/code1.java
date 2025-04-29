
import java.util.Date;

public class code1 {
//heap.. it is a memory area which contains the object

    public static void main(String[] args) {
        int x=100;// primitive type and its nature is store a value where as
        // preserved the address
        String y="sonam";//  String->is a class and  variable used to store a  String you declared is always a reference type variable (or reference variable)
        // date is also a reference type because just like the string date is also a class
        //new is a key word and its use is to allocate the memory   --> similarly work like a malloc function in C

        Date date =new Date();
        System.out.println(date);
        System.out.println(y);// in the output we will get the value which is that variable is storing
    }
    
}
