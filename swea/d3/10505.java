import java.io.*;
import java.util.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int tc=1; tc<=T; tc++) {
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			int sum=0;
			for(int i=0; i<n; i++) {
				arr[i]=Integer.parseInt(st.nextToken());
				sum+=arr[i];
			}
			int avg = sum/n, cnt=0;
			for(int i=0; i<n; i++) {
				if(arr[i]<=avg) cnt++;
			}
			bw.write("#"+tc+" "+cnt+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}