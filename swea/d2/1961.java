import java.util.*;
import java.io.*;
class Solution {
    static int[][] rotate(int n , int[][] arr){
        int[][] res = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                res[i][j] = arr[n-1-j][i];
            }
        }
        return res;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc=1; tc<=T; tc++){
            bw.write("#"+tc+"\n");
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<n; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            int[][] res1 = rotate(n, arr);
            int[][] res2 = rotate(n, res1);
            int[][] res3 = rotate(n, res2);
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++) bw.write(String.valueOf(res1[i][j]));
                bw.write(" ");
                for(int j=0; j<n; j++) bw.write(String.valueOf(res2[i][j]));
                bw.write(" ");
                for(int j=0; j<n; j++) bw.write(String.valueOf(res3[i][j]));
                bw.write("\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}