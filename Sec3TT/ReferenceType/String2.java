public class String2 {
    public static void main(String[] args) {
        // creating string using literals
        String name="Sonam"; //only one object
        String name1="Sonam";

        // Another way of creating a string is using new keyword
        String name3=new String("Sonam"); // in this case may be 1 or 2 objects  //new string create 2 objects i inside the pool and another one outside the 
       System.out.println(name);
       System.out.println(name1);
       
      //now if we check name and name three there address is not same because for name three we created a new object in the heap and address  of the value is different for name3

       System.out.println(name==name1);
       System.out.println(name==name3);
       
    }
    
}
