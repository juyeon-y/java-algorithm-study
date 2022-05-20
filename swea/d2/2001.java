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
            int m = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][n];
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int max = Integer.MIN_VALUE;
            for(int i=0; i<=n-m; i++){
                for(int j=0; j<=n-m; j++){
                    int sum=0;
                    for(int k=0; k<m; k++){
                        for(int l=0; l<m; l++){
                            sum+=arr[i+k][j+l];
                        }
                    }
                    if(max<sum) max=sum;
                }
            }
            bw.write("#"+tc+" "+max+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}