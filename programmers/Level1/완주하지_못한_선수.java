import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<participant.length; i++){
            if(!map.containsKey(participant[i])) map.put(participant[i], 1);
            else map.put(participant[i], map.get(participant[i])+1);
        }
        for(int i=0;i<completion.length; i++){
            map.put(completion[i], map.get(completion[i])-1);
        }
        String answer = "";
        for(Map.Entry<String, Integer> x : map.entrySet()){
            if(x.getValue()==1){
                answer = x.getKey();
                break;
            }
        }
        return answer;
    }
}