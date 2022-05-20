import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=1; i<=t; i++){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) arr[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            bw.write("#"+i+" ");
            for(int j=0; j<n; j++) bw.write(arr[j]+" ");
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}