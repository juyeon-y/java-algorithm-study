import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int len = nums.length;
        for(int i=0; i<len; i++) set.add(nums[i]);
        return Math.min(len/2, set.size());
    }
}