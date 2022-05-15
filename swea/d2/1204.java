import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<t; i++){
            int testNum = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] scoreCnt = new int[101];
            int mode=-1, modeCnt=0;
            for(int j=0; j<1000; j++){
                int score = Integer.parseInt(st.nextToken());
                scoreCnt[score]++;
                if(scoreCnt[score]>modeCnt || (scoreCnt[score]==modeCnt && mode<score)){
                    modeCnt=scoreCnt[score];
                    mode=score;
                }
            }
            bw.write("#"+testNum+" "+mode+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}