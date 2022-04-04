class Solution {
    public boolean solution(String s) {
        boolean isNum = true;
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                isNum = false;
                break;
            }
        }
        if(isNum && (s.length()==4 || s.length()==6)) return true;
        else return false;
    }
}