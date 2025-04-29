public class CountElement {
    public static int countOccurence(int []arr,int target){
        int n=arr.length;
        int count =0;
        for(int i=0;i<n;i++){
           if(arr[i]==target){
            count++;
           }
        }return count;

    }


    public static void main(String[] args) {
        int []arr={12,3,4,12,5,6,};
        int target=12;
       int result= countOccurence(arr,target);
       System.out.println(""+result);
}
}
