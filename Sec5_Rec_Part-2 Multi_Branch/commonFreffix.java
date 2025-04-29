import java.util.Scanner;
public class commonFreffix {

    public static int LongestPrefixFromStr1tostr2(String st1,String str2){
        for(int  
            
        }

    }


    }

      public static int longestCommonPrefix(String s1, String s2) {
            // code here
            int count=0;
           int minLength=Math.min(s1.length(), s2.length());
            StringBuilder result=new StringBuilder();
            //start comparing 
            
           for(int i=0;i<minLength;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                count++;
            }else{
                break;
            }
           }
           return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=sc.next();
        System.out.println("Enter String ");
        String s2=sc.next();
        int result=longestCommonPrefix(s1,s2);
        System.out.println(result);

    }
}
