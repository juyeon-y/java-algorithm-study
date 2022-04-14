class Solution {
    public String solution(String s) {
        String[] nums = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int tmp = Integer.parseInt(nums[i]);
            if(tmp>max) max=tmp;
            if(tmp<min) min=tmp;
        }
        String answer = new StringBuilder().append(min).append(" ").append(max).toString();
        return answer;
    }
}