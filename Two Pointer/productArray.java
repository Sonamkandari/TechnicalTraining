public  class productArray {
   public int[] productExceptSelf(int[] nums) {
      int[] result=new int[nums.length];
      int left=0;
      int right=nums.length-1;
      while(left<right){
          int product=1;
             if(nums[left]<nums[right]){
             if(nums[left]!=nums[right]){
                 product=product*nums[left];
                 left++;
            }else{
                right--;
            }
             
         } result[left]=product;

       } return result;   
    }
    public static void main(String[] args) {
        int []nums={1,2,3,4};
        int[] result=productExceptSelf(nums);
        for(int i=0;i<result.length;i++){
        System.out.print(" "+result[i]);
        }
    }
}
