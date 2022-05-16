import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=1; i<=t; i++){
            bw.write("#"+i+"\n");
            int n = Integer.parseInt(br.readLine());
            int cnt=0;
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                char c = st.nextToken().charAt(0);
                int k = Integer.parseInt(st.nextToken());
                for(int m=0; m<k; m++){
                    cnt++;
                    if(cnt>10){
                        bw.write("\n");
                        cnt=1;
                    }
                    bw.write(String.valueOf(c));
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}