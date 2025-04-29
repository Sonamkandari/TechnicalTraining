import java.util.List;

public class findDuplicate {
    // helper function
    public static int[]Duplicate(int [] nums,int count ){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count ++;
                }
            }

        }return  new int[count];

    }

    public List<Integer> findDuplicates(int[] nums) {
       return Duplicate(nums,count );
        
    }
    
}
