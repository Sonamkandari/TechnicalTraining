public class SearchSpecificElement {
    //with the help of recursion
    public static int[] CountOccurence(int []arr,int i,int Target,int count){
       //BAse case
       
        if(i==arr.length){
            // if we are at last index
            int Result[]=new int[count];
            return Result;
        }

       

        //small problem
        if(arr[i]==Target){
            count++; 
        }
    
        //recusive call
        int Result[]=CountOccurence(arr,i+1,Target,count);
        if(arr[i]==Target){
            Result[count-1]=i;
        }
        return Result;
    }

   public static int[]countOccurence(int arr[],int i,int Target){
       return CountOccurence(arr,i,Target,0);
   }

     //note if element does not occure make a case for that also

    public static void main(String[] args) {
        int arr[]={12,3,4,12,5,6,};
       int i=0;
       int Target=12;
       int Result[]= countOccurence(arr,i,Target);
       //Returnig the count in a array
       for(int j=0;j<Result.length;j++){
        System.out.println(Result[j]);
       }
       
    }
}
