import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            bw.write("#"+tc+"\n");
            int n = Integer.parseInt(br.readLine());
            for(int x : unit){
                bw.write((n/x)+" ");
                n%=x;
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}