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
			int[] arr = new int[n+1];
			for(int i=0; i<n; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				arr[tmp]++;
			}
			boolean flag=true;
			for(int i=1; i<=n; i++) {
				if(arr[i]!=1) {
					flag=false;
					break;
				}
			}
			if(flag) bw.write("#"+tc+" Yes\n");
			else bw.write("#"+tc+" No\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}