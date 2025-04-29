public class BinaryToDecimal {
    public static int convertTOdecimal(int num,int power){
        
        int sum=0;
        
        //base case
        if(num==0){
            return 0;
        }

        //small Problem
        int digit=num%10;
        sum=(int) (sum+(digit*Math.pow(2,power))); 
        return sum+convertTOdecimal(num/10,power+1);//recursive call 
      
        

    }

    public static void main(String[] args) {
        int num=1010;
      int result=  convertTOdecimal(num,0);
      System.out.println(""+result);

    }
    
}
