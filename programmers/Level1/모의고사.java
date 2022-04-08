import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] a3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[4];
        for(int i=0; i<answers.length; i++){
            if(answers[i]==a1[i%5]) score[1]++;
            if(answers[i]==a2[i%8]) score[2]++;
            if(answers[i]==a3[i%10]) score[3]++;
        }
        int max = Math.max(score[3], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=3; i++){
            if(score[i]==max) list.add(i);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}