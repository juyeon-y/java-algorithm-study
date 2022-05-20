import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            bw.write("#"+tc+"\n");
            int n = Integer.parseInt(br.readLine());
            int[] cur = new int[n+2];
            int[] next = new int[n+2];
            cur[1]=1;
            bw.write("1\n");
            for(int i=2; i<=n; i++){
                for(int j=1; j<=i; j++) next[j]=cur[j-1]+cur[j];
                for(int j=1; j<=i; j++) cur[j]=next[j];
                for(int j=1; j<=i; j++) bw.write(cur[j]+" ");
                bw.write("\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}