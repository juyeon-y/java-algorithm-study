class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int sum=b-1;
        for(int i=1; i<a; i++){
            switch(i){
                case 1: case 3: case 5: case 7: case 8: case 10:
                    sum+=31;
                    break;
                case 2:
                    sum+=29;
                    break;
                default:
                    sum+=30;
                
            }
        }
        return day[sum%7];
    }
}