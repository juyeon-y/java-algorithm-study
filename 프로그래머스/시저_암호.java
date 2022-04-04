class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=' '){
                if(Character.isUpperCase(arr[i])){
                    arr[i] = (char)(arr[i]+n);
                    if(arr[i]>90) arr[i] = (char)(arr[i]-26);
                }
                else{
                    arr[i] = (char)(arr[i]+n);
                    if(arr[i]>122) arr[i] = (char)(arr[i]-26);
                }
            }
        }
        return String.valueOf(arr);
    }
}
// 아스키코드 값 : 'A'~'Z' = 65~90, 'a'~'z' = 97~122