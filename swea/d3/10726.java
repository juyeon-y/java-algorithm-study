import java.io.*;
import java.util.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int tc=1; tc<=T; tc++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int cnt=0;
			for(int i=0; i<n; i++) {
				if((m&1<<i)!=0) cnt++;
			}
			if(cnt==n) bw.write("#"+tc+" ON\n");
			else bw.write("#"+tc+" OFF\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}