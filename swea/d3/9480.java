import java.util.*;
import java.io.*;
class Solution{
	public static int n, cnt;
	public static String[] words;
	public static int[] chk;
	public static void dfs(int lev) {
		if(lev==n) {
			HashSet<Character> set = new HashSet<>();
			for(int i=0; i<n; i++) {
				if(chk[i]==1) {
					for(char c : words[i].toCharArray()) {
						set.add(c);
					}
				}
			}
			if(set.size()==26) cnt++;
		}
		else {
			chk[lev]=1;
			dfs(lev+1);
			chk[lev]=0;
			dfs(lev+1);
		}
	}
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			n = Integer.parseInt(br.readLine());
			cnt=0;
			words = new String[n];
			chk = new int[n];
			for(int i=0; i<n; i++) words[i]=br.readLine();
			dfs(0);
			bw.write("#"+tc+" "+cnt+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}