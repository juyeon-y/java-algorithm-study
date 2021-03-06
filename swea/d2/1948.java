import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc=1; tc<=T; tc++){
            bw.write("#"+tc+" ");
            st = new StringTokenizer(br.readLine());
            int m1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());
            int sum = d2-d1+1;
            for(int i=m1; i<m2; i++) sum+=dayOfMonth[i-1];
            bw.write(sum+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}