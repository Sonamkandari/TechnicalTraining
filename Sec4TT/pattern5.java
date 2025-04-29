
public class pattern5 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
           if(i==1||j==1||j==n||j==i||i==5){
                System.out.print("*");// print ion same line
            }else{
                System.out.print(" ");
            }
        }
        System.err.println(" ");// print in new line
    }   
}
}

