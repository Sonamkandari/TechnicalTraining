public class pattern6{
    public static void main(String[] var0) {
        int n=5;
        for(int i = 0; i <= n;i++) {
           for(int j = 1; j <=n-i+1;j++) {
            if(j==1||i==1||j==n-i+1){
              System.out.print("*");
            }else{
                System.out.print(" ");
            }
           }
  
           System.err.println(" ");
        }
  
     }
    
}

