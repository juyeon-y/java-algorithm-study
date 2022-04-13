import java.util.*;
class Solution {
    class User{
        int cnt;
        HashSet<String> idSet;
        public User(){
            cnt = 0;
            idSet = new HashSet<>();
        }
    }
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, User> map = new HashMap<>();
        for(String s : id_list){
            map.put(s, new User());
        }
        for(String s : report){
            String[] tmp = s.split(" ");
            if(!map.get(tmp[0]).idSet.contains(tmp[1])){
                map.get(tmp[0]).idSet.add(tmp[1]);
                map.get(tmp[1]).cnt++;
            }
        }
        int[] answer = new int[id_list.length];
        for(int i=0; i<id_list.length; i++){
            HashSet<String> tmp = map.get(id_list[i]).idSet;
            int mailCnt=0;
            for(String s : tmp){
                if(map.get(s).cnt>=k) mailCnt++;
            }
            answer[i] = mailCnt;
        }
        return answer;
    }
}