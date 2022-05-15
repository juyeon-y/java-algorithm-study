import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max=Integer.MIN_VALUE;
            for(int j=0; j<10; j++){
                int tmp = Integer.parseInt(st.nextToken());
                if(max<tmp) max=tmp;
            }
            bw.write("#"+i+" "+max+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}