import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc=1; tc<=T; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[7];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<7; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int min = Integer.MAX_VALUE;
            for(int i=0; i<7; i++){
                if(arr[i]==1){
                    int j=i, left=n;
                    int cnt=0;
                    while(left!=0){
                        cnt++;
                        if(arr[j%7]==1) left--;
                        j++;
                    }
                    if(min>cnt) min=cnt;
                }
            }
            bw.write("#"+tc+" "+min+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}