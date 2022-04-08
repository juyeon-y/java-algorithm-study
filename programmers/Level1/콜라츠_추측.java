class Solution {
    public int solution(int num) {
        int cnt = 0;
        long tmp = num;
        while(tmp!=1){
            if(cnt==500){
                cnt = -1;
                break;
            }
            if(tmp%2==0) tmp/=2;
            else tmp = tmp*3+1;
            cnt++;
        }
        return cnt;
    }
}

// int형 num을 가지고 문제의 1-1, 1-2 작업을 반복하다보면, 숫자가 커지면서 오버플로우 발생해 값이 손실될 수 있음.
// 따라서 long형 변수에 num값 대입해 형변환해준다.