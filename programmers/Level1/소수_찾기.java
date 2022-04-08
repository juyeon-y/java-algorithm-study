class Solution {
    public int solution(int n) {
        int cnt = 0;
        int[] chk = new int[n+1];
        for(int i=2; i<=n; i++){
            if(chk[i]==0){
                cnt++;
                for(int j=i; j<=n; j+=i){
                    chk[j]=1;
                }
            }
        }
        return cnt;
    }
}
// 에라토스테네스의 체