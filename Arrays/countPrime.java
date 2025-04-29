import java.util.Arrays;

class countPrime{
    public static int countPrimes(int n) {
    if(n<=2){
        return 0;
    }
    boolean []mylist =new boolean[n];
    Arrays.fill(mylist,true);//assume all numbers are prime   
        mylist[0]=mylist[1]=false;//0,1 are not prime
        for (int i = 2; i*i < n; i++) { //iterate only up to sqrt
            if (mylist[i]) {
               for (int j = i * i; j < n; j += i) { // Mark multiples of i as non-prime
                    mylist[j] = false;
            }
        }
       
    }
       int count = 0;
        for (boolean prime : mylist) {
            if (prime) count++;
        }
    
        return count;
    }

    public static void main(String[] args) {
        
        int n = 10; // Example input
        System.out.println("Number of prime numbers less than " + n + " is: " + countPrimes(n));
    }
}