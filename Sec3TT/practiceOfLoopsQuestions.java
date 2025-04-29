public class practiceOfLoopsQuestions {
    public static void main(String[] args) {
        int num=5678;
        int sum=0;
    // while(num!=0){// loop is used for iterating the condition until it traverse each and every single digit of the number
    //     int digit=num%10;
    //     sum=sum+digit;
    //    num= num/10;
    // }
        
    //     System.out.println("sum is:"+sum);

    // second question
    // print all the digits of the number but in the first to  last digit from left to right it means the first digit is the left most digit of the number
    

    //creating a copy of the number so it will not be destroyed
    int copy=num;
    int count=0;
    while(copy!=0){
        count++;
        copy=copy/10;   
       
    }
    while (num!=0){
        int pow=(int)Math.pow(10,count-1);
        System.out.println(num/pow);
        num=num%pow;
        count--;

    } 
        
    






    }

}
