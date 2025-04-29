public class PrimeNum {
    public static void main(String[] args) {
        int num=36;
        int count=0;
        // using a loop 
        for(int i=0;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is a prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }
    
}
