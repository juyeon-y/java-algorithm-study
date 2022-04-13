class Solution {
    public String solution(int[] numbers, String hand) {
        int[][] coord = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
        int[] left = {3,0};
        int[] right = {3,2};
        StringBuilder sb = new StringBuilder();
        for(int x : numbers){
            if(x%3==1){
                left = coord[x];
                sb.append('L');
            }
            else if(x!=0 && x%3==0){
                right = coord[x];
                sb.append('R');
            }
            else{
                int lDist = Math.abs(left[0]-coord[x][0])+Math.abs(left[1]-coord[x][1]);
                int rDist = Math.abs(right[0]-coord[x][0])+Math.abs(right[1]-coord[x][1]);
                if(lDist<rDist || (lDist==rDist && hand.equals("left"))){
                    left = coord[x];
                    sb.append('L');
                }
                else{
                    right = coord[x];
                    sb.append('R');
                }
            }
        }
        return sb.toString();
    }
}