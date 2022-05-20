import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            int n = Integer.parseInt(br.readLine());
            int sum=0;
            for(int i=1; i<=n; i++){
                if(i%2==1) sum+=i;
                else sum-=i;
            }
            bw.write("#"+tc+" "+sum+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}