class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        answer = (long)(max-min+1)*(min+max)/2;
        return answer;
    }
}
// 등차수열의 합 공식 : n(a+l)/2