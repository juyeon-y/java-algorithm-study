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
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int max = Math.min(a, b);
			int min = Math.max(a+b-n, 0);
			bw.write("#"+tc+" "+max+" "+min+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}