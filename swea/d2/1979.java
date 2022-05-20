import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc=1; tc<=T; tc++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n+1][n+1];
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int answer=0;
            for(int i=0; i<n; i++){
                int cnt=0;
                for(int j=0; j<=n; j++){
                    if(arr[i][j]==1) cnt++;
                    else{
                        if(cnt==k) answer++;
                        cnt=0;
                    }
                }
            }
            for(int j=0; j<n; j++){
                int cnt=0;
                for(int i=0; i<=n; i++){
                    if(arr[i][j]==1) cnt++;
                    else{
                        if(cnt==k) answer++;
                        cnt=0;
                    }
                }
            }
            bw.write("#"+tc+" "+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}