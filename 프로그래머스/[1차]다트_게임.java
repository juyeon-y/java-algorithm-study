import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int idx=-1;
        for(int i=0; i<dartResult.length(); i++){
            if(Character.isDigit(dartResult.charAt(i))){
                score[++idx] = dartResult.charAt(i)-48;
                if(Character.isDigit(dartResult.charAt(i+1))){
                    score[idx] = score[idx]*10 + dartResult.charAt(++i)-48;
                }
            }
            else if(dartResult.charAt(i)=='D') score[idx] = (int)Math.pow(score[idx], 2);
            else if(dartResult.charAt(i)=='T') score[idx] = (int)Math.pow(score[idx], 3);
            else if(dartResult.charAt(i)=='*'){
                score[idx]*=2;
                if(idx-1>=0) score[idx-1]*=2;
            }
            else if(dartResult.charAt(i)=='#') score[idx]*=(-1);
        }
        int answer = 0;
        for(int i=0; i<score.length; i++){
            answer+=score[i];
        }
        return answer;
    }
}