class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length==1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        answer = new int[arr.length-1];
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        int idx=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=min){
                answer[idx]=arr[i];
                idx++;
            }
        }
        return answer;
    }
}