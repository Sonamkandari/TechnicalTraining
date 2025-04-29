import java.util.HashMap;

public class subArraySum {
  public static int subarraySum(int[] nums, int k) {
   int count = 0, sum = 0;
   HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);  //map.put(0, 1) means:  there is one way to have a prefix sum 0 --this help count subarrays that start from index 0
    
            for (int num : nums) {  //Add each number to sum, forming a prefix sum at each step.
                sum += num;
    
                if (map.containsKey(sum - k)) {
                    count += map.get(sum - k);
                }
                /*sum = 1 + 2 = 3
                 sum - k = 3 - 3 = 0 → found in map!
                 map.get(0) = 1 */
    
                map.put(sum, map.getOrDefault(sum, 0) + 1);  //Store the current prefix sum sum in the map.
            }
      
            return count;
        }

        public static void main(String[] args) {
            System.out.println("Enter the elements of the array");
            int []nums={1,2,3};
            int k=3;
            int Result=subarraySum(nums,k);
            System.out.println("Rsult is :" +Result);
            
        }
      
}
