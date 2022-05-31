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
			double p = Double.parseDouble(st.nextToken());
			double q = Double.parseDouble(st.nextToken());
			double s1 = (1-p)*q;
			double s2 = p*(1-q)*q;
			if(s1<s2) bw.write("#"+tc+" YES\n");
			else bw.write("#"+tc+" NO\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}