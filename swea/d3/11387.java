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
			int d = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int total = 0;
			for(int i=0; i<n; i++) total+=d+d*i*l/100;
			bw.write("#"+tc+" "+total+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}