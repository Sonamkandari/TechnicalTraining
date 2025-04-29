//EnhanceForLoop
import java.util.ArrayList;
public class Sec3_lect7 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //java 5 onwards
        //int age=5;//single value
        int ages[]={12,34,56,78,44};

        /*for(int i=0;i<=ages.length;i++){
            //printing the elements of array
            System.out.println(ages[i]);

        }*/

         // enhance for loop
         for(int age:ages){
            // it can not be reversed
            System.out.println(age);

        // After java 8 onwards we get a feature of for each loop
        // java * onwards we have function programming

        
    

         }
         ///array list is a class it is a resizable array

         ArrayList<Integer>list=new ArrayList<>();
         list.add(100);
         list.add(200);
         list.add(300);
         list.add(400);
         list.add(500);
         list.add(100);
         list.add(600);
         list.add(100);
         list.add(100);
         list.add(100);
         list.add(100);
         list.add(100);
         list.add(100);
         list.add(100);
         list.add(100);
         list.add(100);
         list.add(100);
         list.add(100);
         list.add(100);

         //printing the elements of list
         for(Integer store:list){
            System.out.println(store);
         }
         // for each is not a loop it is a function

         list.forEach(W->System.out.println(W));// lemda function
         //consumer function  and //

    }
    
}
