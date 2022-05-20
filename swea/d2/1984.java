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
            int[] arr = new int[10];
            for(int i=0; i<10; i++) arr[i] = Integer.parseInt(st.nextToken());
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum=0;
            for(int i=0; i<10; i++){
                if(max<arr[i]) max=arr[i];
                if(min>arr[i]) min=arr[i];
                sum+=arr[i];
            }
            sum-=(min+max);
            int avg = (int)(sum/8.0+0.5);
            bw.write("#"+tc+" "+avg+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}