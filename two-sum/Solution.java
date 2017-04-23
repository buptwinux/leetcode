import java.util.HashMap; 
import java.util.Set;
import java.util.Map.Entry;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(); 
        int [] result = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int res = target - nums[j];
            if (hashMap.containsKey(res)) {
                int temp = hashMap.get(res);
                if (temp != j) {
                    result[0] = j;
                    result[1] = temp;
                    break;
                }
            }
        }

        return result;
    } 

    public static void main (String [] args) {
        int [] a = {3, 2, 4};
        int [] res = new int[2];
        int t = 6;

        Solution so = new Solution();
        res = so.twoSum(a, t);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
