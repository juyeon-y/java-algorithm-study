class Solution {
    public long solution(int price, int money, int count) {
        long answer = (long)(count*(1+count)/2) * price - money;
        return Math.max(answer, 0);
    }
}
// 등차수열의 합 공식 : n(a+l)/2