class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n; i++){
            answer[i] = (long)x * (i+1);
        }
        return answer;
    }
}

// x = 10000000, n = 1000일 경우 마지막 숫자가 10000000000로 int 범위를 벗어나기 때문에, long 타입 배열 answer에 값을 저장함.
// 치환문(=)이나 수식 내에서 타입이 일치하지 않을 때, 컴파일러는 오류 대신 작은 타입(int)을 큰 타입(long)으로 자동 변환함.
// answer[i] = x * (i+1); -> 우변이 int 타입으로 계산되어 값이 손실될 수 있음. 손실된 값을 long 타입으로 변환하여 저장하기 때문에 오답이 나옴.
// answer[i] = (long)x * (i+1); -> 우변이 long 타입으로 계산되어 값이 손실되지 않음.
// 다른 풀이로는 answer[0] = x; 하고 for(int i = 1; i < n; i++){ answer[i] = answer[i - 1] + x; } 로 배열값을 넣어주는 방법도 있으며, 이 방법도 우변이 long 타입으로 계산되어 값이 손실되지 않음.