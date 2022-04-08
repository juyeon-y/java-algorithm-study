import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum=0, cnt=0;
        for(int x : d){
            sum+=x;
            if(sum > budget) break;
            cnt++;
        }
        return cnt;
    }
}