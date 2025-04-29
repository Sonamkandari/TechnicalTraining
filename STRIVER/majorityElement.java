public class majorityElement {
    public static int majorityElement(int[] nums) {
     
        int n = nums.length;
        int maxCount = 0;
        int majorityElement = nums[0];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                majorityElement = nums[i];
            }
        }

        return majorityElement;
    }


    public static int majorityElement2(int[] nums) {
     
        int count =0;
        int candidate=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            count+=(num==candidate)?1:-1;
        }return candidate;

    }

    public static void main(String[] args) {
        int[]nums={2,3,4,2,7,8,92,3};
    //    int result= majorityElement(nums);
    //    System.out.println("Result is" + result);

       int result2= majorityElement2(nums);
       System.out.println("Result is" + result2);
    }
}
