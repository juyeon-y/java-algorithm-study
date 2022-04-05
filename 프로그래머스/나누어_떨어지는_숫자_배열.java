import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int x : arr){
            if(x%divisor==0) list.add(x); 
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        if(answer.length==0) return new int[]{-1};
        else return answer;
    }
}