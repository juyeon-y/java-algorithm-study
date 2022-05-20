import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=1; i<=t; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            int[] b = new int[m];
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) a[j] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) b[j] = Integer.parseInt(st.nextToken());
            int max = Integer.MIN_VALUE;
            for(int j=0; j<=Math.abs(n-m); j++){
                int sum=0;
                if(n>m){
                    for(int k=0; k<m; k++) sum+=a[j+k]*b[k];
                }
                else{
                    for(int k=0; k<n; k++) sum+=a[k]*b[j+k];
                }
                if(max<sum) max=sum;
            }
            bw.write("#"+i+" "+max+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}