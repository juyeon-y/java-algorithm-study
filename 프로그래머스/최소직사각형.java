class Solution {
    public int solution(int[][] sizes) {
        int w = Integer.MIN_VALUE, h = Integer.MIN_VALUE;
        for(int i=0; i<sizes.length; i++){
            int a = Math.max(sizes[i][0], sizes[i][1]);
            int b = Math.min(sizes[i][0], sizes[i][1]);
            if(a>w) w=a;
            if(b>h) h=b;
        }
        return w*h;
    }
}