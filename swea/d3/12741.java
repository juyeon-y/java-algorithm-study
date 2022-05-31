import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc=1; tc<=T; tc++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[4];
            for(int i=0; i<4; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int lt = Math.max(arr[0], arr[2]);
            int rt = Math.min(arr[1], arr[3]);
            int answer = Math.max(rt-lt, 0);
            bw.write("#"+tc+" "+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}