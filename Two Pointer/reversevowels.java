public class reversevowels{
    // make a function for vowels
    boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)>=0;
       }
 
    public String reverseVowels(String s) {
       int i=0;
       int j=s.length()-1;
       //convert string int char aaray beacuase string is imutable
       char arr[]=s.toCharArray();
       while(i<=j){
        if(!isVowel(arr[i])){
            i++;
        }else if(!isVowel(arr[j])){
            j--;
        }else{
            //it means vowel is found now swap
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

       }return new String(arr);// conveting the array into string again
        
    }
    public static void main(String[] args) {
        String s="leetcode";
        reversevowels myobj=new reversevowels();//create an object
        String result = myobj.reverseVowels(s); // calling the  method
        System.out.println(result);

    }

    
}
