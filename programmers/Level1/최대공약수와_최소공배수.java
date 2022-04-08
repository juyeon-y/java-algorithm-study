import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int product = n*m;
        while(m>0){
            int tmp = m;
            m = n%m;
            n = tmp;
        }
        answer[0] = n;
        answer[1] = product/n;
        return answer;
    }
}
// 유클리드 호제법으로 최대공약수 구함
// 두 자연수의 곱 = 최대공약수 * 최소공배수