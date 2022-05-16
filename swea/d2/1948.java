import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=1; i<=t; i++){
            int answer=0;
            bw.write("#"+i+" ");
            st = new StringTokenizer(br.readLine());
            int m1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());
            if(m1==m2) bw.write((d2-d1+1)+"\n");
            else{
                answer+=dayOfMonth[m1-1]-d1+1;
                for(int j=m1+1; j<m2; j++){
                    answer+=dayOfMonth[j-1];
                }
                answer+=d2;
                bw.write(answer+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}