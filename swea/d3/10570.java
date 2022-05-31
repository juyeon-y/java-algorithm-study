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
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int cnt=0;
			for(int i=a; i<=b; i++) {
				int tmp = (int)Math.sqrt(i);
				if(i==tmp*tmp) {
					String n = String.valueOf(i);
					String sqrt = String.valueOf(tmp);
					if(n.equals(new StringBuilder(n).reverse().toString()) && sqrt.equals(new StringBuilder(sqrt).reverse().toString())) {
						cnt++;
					}
				}
			}
			bw.write("#"+tc+" "+cnt+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}