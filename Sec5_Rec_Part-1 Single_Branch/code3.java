public class code3 {
    static void printDigit(int num){
        // small problem
        if(num==0){
            return;
        }
        printDigit(num/10);
        // printing the value which is falling
        /*1%10=1
          12%10=2
          123%10=3
          1234%10=4 
          12345%10=5
            */ 
        System.out.println(num%10);//post processing
    
}
    public static void main(String[] args) {
        printDigit(12345);
        
    }
    
}
