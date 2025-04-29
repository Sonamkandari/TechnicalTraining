import java.util.Scanner;
public class Ques6 {
public static boolean isValid(String password,int minLength){
if(password.length()<minLength) 
return false;
boolean hasUpperCase=false,hasDigit=false;
for(int i=0;i<password.length();i++){
    char c=password.charAt(i);
    if(Character.isUpperCase(c)) {
    hasUpperCase=true;
    }
    if(Character.isDigit(c)){
        hasDigit=true;
    }

    if(hasUpperCase&&hasDigit){
    return true;
    }
}
return false;

}
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password");
        String password=sc.nextLine();
        System.out.println("Enter the limit");
        int limit=sc.nextInt();
        System.out.println(isValid(password, limit));

       
    }  
 }
    

