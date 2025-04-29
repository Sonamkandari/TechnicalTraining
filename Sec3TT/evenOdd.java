public  class evenOdd {
    public static void main(String[] args) {
       
        int num =4;

        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
         // using xor function
        if((num^1) == num+1){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        // using And operator
        if((num&1)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        // using or operator
        if((num|1)>num){// if exceed
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
    }

    
}
