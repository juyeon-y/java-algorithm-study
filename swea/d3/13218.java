import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            int n = Integer.parseInt(br.readLine());
            bw.write("#"+tc+" "+n/3+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}