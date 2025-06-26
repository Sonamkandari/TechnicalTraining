public class reverse {
    public static void main(String[] args) {
        int arr[]={10,23,45,56};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("after reverse");
        for(int element:arr){
          System.out.println(element);  
        }
    }
    
}
