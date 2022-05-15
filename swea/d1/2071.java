import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=1; i<=t; i++){
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int j=0; j<10; j++) sum+=Integer.parseInt(st.nextToken());
            int avg = (int)(sum/10.0+0.5);
            bw.write("#"+i+" "+avg+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}