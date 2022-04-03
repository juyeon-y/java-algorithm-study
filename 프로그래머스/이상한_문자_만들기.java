class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==' ') idx = 0;
            else{
                if(idx%2==0) arr[i] = Character.toUpperCase(arr[i]);
                else arr[i] = Character.toLowerCase(arr[i]);
                idx++;
            }
        }
        return String.valueOf(arr);
    }
}
// "각 단어는 하나 이상의 공백문자로 구분되어 있습니다." -> 따라서 s.split(" ") 사용하면 오답나옴.