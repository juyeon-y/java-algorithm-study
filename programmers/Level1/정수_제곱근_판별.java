class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = (long)Math.sqrt(n);
        if(n == x*x) answer = (x+1)*(x+1);
        else answer = -1;
        return answer;
    }
}
// static double sqrt(double a) : a의 제곱근을 double 타입으로 리턴
// 제곱근이 정수가 아니면 double -> long 과정에서 값 손실되며 n != x*x.
// 제곱근이 정수면 double -> long 과정에서 값 손실 없으며 n == x*x.