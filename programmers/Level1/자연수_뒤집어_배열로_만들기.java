class Solution {
    public int[] solution(long n) {
        int len = String.valueOf(n).length();
        int[] answer = new int[len];
        int i = 0;
        while(n>0){
            answer[i++] = (int)(n%10);
            n/=10;
        }
        return answer;
    }
}
// 치환문(=)이나 수식 내에서 타입이 일치하지 않을 때,
// 1) 컴파일러는 오류 대신 작은 타입을 큰 타입으로 자동 변환함. 
// 2) 단, 큰 타입의 값을 작은 타입의 값으로 변환해야 할 때는, 컴파일러는 컴파일 오류 발생시킴.