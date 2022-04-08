class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] s = new int[n+2];
        for(int x : lost) s[x]--;
        for(int x : reserve) s[x]++;
        int answer = n;
        for(int i=1; i<=n; i++){
            if(s[i]==-1){
                if(s[i-1]==1){
                    s[i-1]--;
                    s[i]++;
                }
                else if(s[i+1]==1){
                    s[i+1]--;
                    s[i]++;
                }
                else answer--;
            }
        }
        return answer;
    }
}