class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            int r = (int)Math.sqrt(i);
            if(i==r*r) answer-=i;
            else answer+=i;
        }
        return answer;
    }
}