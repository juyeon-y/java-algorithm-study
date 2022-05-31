import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            String tmp = br.readLine();
            int gameCnt=0, winCnt=0;
            for(char c : tmp.toCharArray()){
                gameCnt++;
                if(c=='o') winCnt++;
            }
            if(winCnt+15-gameCnt>=8) bw.write("#"+tc+" YES\n");
            else bw.write("#"+tc+" NO\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}