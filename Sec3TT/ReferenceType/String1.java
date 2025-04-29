
public class String1 {
public static void main(String[] args) {
//     String fisrtName ="sonam";
//     String Lastname="Kandari";
//     System.out.println(fisrtName.codePointAt(3));// it will gave Ascii of first character
//     // plus operator is also used to concatenate two strings
//     System.out.println(fisrtName+Lastname);
//    String t;
//    // objects are stored in a heap


   //Reference type provide us mutability'

   StringBuffer sb=new StringBuffer("SONAM") ;// Sb is a reference type variable is here and containing the address of value i.e SONAM
   StringBuffer sb2=sb; //sb2 is pointing to sb 
   System.out.println(sb);
   System.out.println(sb2);

   //if  i will make change in sb2 than value of sb will also change

   sb2.append("Kandari");

   //printing both te strings after making a change

   System.out.println(sb); // output -> SONAMKandari 
   System.out.println(sb2);// similarly
   




  

}
}
