import java.util.Scanner;

public class ElementOccuInArray {
    static int ElementOccuInArray(int []element,int x){
        int count =0;
        for(int i:element){
            if(i==x){
              count++;
            }
        }
        return count;
       

        }

        //we can create an method for getting all indexes 
        static int allIndexes(int []input,int x,int n ){
            int []output=new int[n];
            for(int i=1;i<input.length;i++){
                
            }
        }
        
       
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        
        int []element=new int[n];
        System.out.println("Enter the array elements:");
        for(int j=0;j<n;j++){
            element[j]=sc.nextInt();
        }

        System.out.println("Enter value of x:");
        int x=sc.nextInt();
        int occurence =ElementOccuInArray(element,x);
        System.out.println(occurence);
        sc.close();
    
}

    
}
