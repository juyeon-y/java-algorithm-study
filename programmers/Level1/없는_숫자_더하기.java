class Solution {
    public int solution(int[] numbers) {
        int[] chk = new int[10];
        for(int i=0; i<numbers.length; i++){
            chk[numbers[i]] = 1;
        }
        int answer=0;
        for(int i=0; i<chk.length; i++){
            if(chk[i]==0) answer+=i; 
        }
        return answer;
    }
}
// 합을 리턴하는 문제이고 numbers의 모든 원소는 서로 다르므로, 
// 0부터 9까지를 다 더한 값 45에서 numbers의 원소를 모두 빼준 값을 리턴해주는 방식으로 풀어도 됨.