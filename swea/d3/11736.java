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
			st= new StringTokenizer(br.readLine());
			int cnt=0;
			int[] arr = new int[n];
			for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
			for(int i=1; i<n-1; i++) {
				int max = Math.max(arr[i-1], Math.max(arr[i], arr[i+1]));
				int min = Math.min(arr[i-1], Math.min(arr[i], arr[i+1]));
				if(arr[i]!=max && arr[i]!=min) cnt++;
			}
			bw.write("#"+tc+" "+cnt+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}