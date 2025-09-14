import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        int count = nums.length / 2;
        int typeCount = set.size();
        
        if (count > typeCount) {
            return typeCount;
        } else {
            return count;
        }
    }
}