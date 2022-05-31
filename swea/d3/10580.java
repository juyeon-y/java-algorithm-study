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
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				a[i] = Integer.parseInt(st.nextToken());
				b[i] = Integer.parseInt(st.nextToken());
			}
			int cnt=0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(a[j]>a[i] && b[j]<b[i]) cnt++;
				}
			}
			bw.write("#"+tc+" "+cnt+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}