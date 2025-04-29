public class lect_01 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //java is a statically type language
        //variables
        //int x; //explicit
        //var y=100;// implicit way //type inference // this way is used when we knows the exact values
        //declare a variable always alphanumerically
        //Naming convetion should be always in camel case
        //don't use reserved keywords as a class name
        

        // constant
        final int MIN_AGE =18;//constant will be declare in all caps ->it can not be change
        int age=20;
        if(age<=MIN_AGE){
            System.out.println("unable to gave vote");
        }


        //data type

        //primitive data type ->value type ->//simple type ->single type
         byte a=20;//1byte
         //short=676;
         int w=78;//
         long t=67998;
         float b3=(float) 100.70;//asking for type cast.?
         float b4=237.00f;
         char c='ए';
         System.out.println(c);
        //Non primitive data type ->Mutable type ->//Reference type// complext type // multiple types


        //**(Reference type)
        //1>STRING

        //name ? is a Reference type variable
       String name="  sonam";// name is storing its reference
       //object have capability to kept operations and methods

       System.out.println(name.toUpperCase());
       System.out.println(name.trim());
       String y =name;
       System.out.println(y);// string is also immutable

       
       //WHILE USING STRING HOW MANY OBJECTS ARE CREATED..? -->0,1


       //STRING LITERAL -> mostly recommende to use this

       // string used string pool
       
       String name1="Doremon";
       String name2="Doremon";
       name2="sonam";// string is immutable --> original string is immutable
       System.out.println(name2);// here a new memory is created // changed happen in the copy
     
       String name3=new  String("Amit");//New makes 1 abd 2 objects 
       System.out.println(name1==name2);
       System.out.println(name1==name3);
       String name4=new  String("Ram").intern();//output true
       String name5="Ram";
       System.out.println(name4==name5);// output is false
       
     // **//intern is a method***

       //**//when should we use a string data type or when not ..?



    }

    
}

