class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++) arr1[i] |= arr2[i];
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=n-1; j>=0; j--){
                if((arr1[i]&(1<<j)) > 0) sb.append('#');
                else sb.append(' ');
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}
// 비트단위의 논리연산자(&,^,|)보다 비교연산자(<,>,<=,>=,==,!=)의 연산자 우선순위가 더 높음에 주의.