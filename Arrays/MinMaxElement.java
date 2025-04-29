public class MinMaxElement {
    //since two element are returning return in a array 
    static int[] getminmax(int arr[],int index){
     //Base case
     if(arr.length==index){
        int result[]=new int[2];//(0,0) */ size is 2 because we are returning two values min and max only 
        result[0]=Integer.MAX_VALUE;
        result[1]=Integer.MIN_VALUE;

        return result;
     }
         //stack fall
        //small problem [we want to traveRse the ARRAY]
       int result[]= getminmax(arr,index+1);
       //min element
       if(result[0]>arr[index]){
        result[0]=arr[index];
        //max element
       }else if(result[1]<arr[index]){
        result[1]=arr[index];
       }
      return result;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,7,2,7,8};
        int index=0;  
        // calling the method which we have been created
        int result[]=getminmax(arr,0);
        System.out.println("Minimun Element: "+result[0]+ " Maximum Element: "+result[1]);


    }
    
}
