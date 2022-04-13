class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(char c : s.toCharArray()){
            if(c==' ') flag = true;
            else if(flag){
                flag = false;
                if(Character.isAlphabetic(c)) c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
// Character 클래스의 toUpperCase() 메소드는 문자를 대문자로 변환해 리턴하지만, 대문자가 없는 문자라면(숫자 등) 처음 문자 그대로 리턴함.
// 따라서 if(Character.isAlphabetic(c)) c = Character.toUpperCase(c); 대신 c = Character.toUpperCase(c); 써도 같은 결과 나옴.