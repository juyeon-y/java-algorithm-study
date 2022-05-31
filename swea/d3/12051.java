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
			long n = Long.parseLong(st.nextToken());
			int pd = Integer.parseInt(st.nextToken());
			int pg = Integer.parseInt(st.nextToken());
			if((pd!=100 && pg==100) || (pd!=0 && pg==0)) {
				bw.write("#"+tc+" Broken\n");
			}
			else {
				boolean flag=false;
				for(long i=1; i<=n; i++) {
					if(i*pd%100==0) {
						flag=true;
						break;
					}
				}
				if(flag)  bw.write("#"+tc+" Possible\n");
				else bw.write("#"+tc+" Broken\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}