import java.util.Arrays;
import java.util.HashMap;

public class HashTwoSum {
    public static void main(String[] args) {
        int[] nums = {4, 5, 10, 1};
        int target = 9;
        
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
        System.out.println("Numbers: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
    }
    
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            
            if(numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            }
            
            numMap.put(num, i);
        }
        
        return new int[] {-1, -1};  // Not found
    }
}