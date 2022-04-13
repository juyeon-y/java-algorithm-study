class Solution {
    public int solution(int[] arr) {
        int num1 = arr[0];
        for(int i=1; i<arr.length; i++){
            int num2 = arr[i];
            int prod = num1*num2;
            while(num2>0){
                int tmp = num2;
                num2 = num1%num2;
                num1 = tmp;
            }
            num1 = prod/num1;
        }
        return num1;
    }
}
//유클리드 호제법
//두 자연수의 곱 = 최대공약수 * 최소공배수