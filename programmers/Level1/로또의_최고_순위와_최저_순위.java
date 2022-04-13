import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        HashSet<Integer> set = new HashSet<>();
        int zeroCnt=0;
        for(int x : lottos){
            if(x==0) zeroCnt++;
            else set.add(x);
        }
        int hit=0;
        for(int x : win_nums){
            if(set.contains(x)) hit++;
        }
        int[] answer = new int[2];
        answer[0] = Math.min(7-(hit+zeroCnt), 6);
        answer[1] = Math.min(7-hit, 6);
        return answer;
    }
}