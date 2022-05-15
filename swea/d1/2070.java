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
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a>b) bw.write("#"+i+" "+">\n");
            else if(a<b) bw.write("#"+i+" "+"<\n");
            else bw.write("#"+i+" "+"=\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}