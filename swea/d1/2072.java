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
            for(int j=0; j<10; j++){
                int tmp = Integer.parseInt(st.nextToken());
                if(tmp%2!=0) sum+=tmp;
            }
            bw.write("#"+i+" "+sum+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}