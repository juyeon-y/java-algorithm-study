class Solution {
    public int solution(String s) {
        boolean isNegative = false;
        int idx = 0, answer = 0;
        if(!Character.isDigit(s.charAt(0))){
            idx++;
            if(s.charAt(0)=='-') isNegative = true;
        }
        for(int i=idx; i<s.length(); i++){
            answer = answer*10+s.charAt(i)-48;
        }
        if(isNegative) return (-1)*answer;
        else return answer;
    }
}
// 혹은 Integer.parseInt(s) 사용해서 한 줄로 끝낼 수도 있음.