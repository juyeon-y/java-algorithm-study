class Solution {
    public int solution(int n) {
        int answer = 1, cnt=1;
        n-=1;
        while(n>0){
            n-=++cnt;
            if(n%cnt==0) answer++;
        }
        return answer;
    }
}