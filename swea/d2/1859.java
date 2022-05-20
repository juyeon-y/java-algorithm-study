import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc=1; tc<=T; tc++){
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] price = new int[n];
            for(int i=0; i<n; i++) price[i] = Integer.parseInt(st.nextToken());
            int max = Integer.MIN_VALUE;
            long profit=0;
            for(int i=n-1; i>=0; i--){
                if(max<price[i]) max=price[i];
                else profit+=max-price[i];
            }
            bw.write("#"+tc+" "+profit+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}