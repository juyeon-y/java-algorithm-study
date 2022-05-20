import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc=1; tc<=T; tc++){
            bw.write("#"+tc+" ");
            st = new StringTokenizer(br.readLine());
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int hour = (h1+h2+(m1+m2)/60)%12;
            if(hour==0) hour=12;
            int minute = (m1+m2)%60;
            bw.write(hour+" "+minute+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}