import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        Iterator<Integer> it = set.iterator();
        int[] answer = new int[set.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = it.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}