import java.io.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			int n = Integer.parseInt(br.readLine());
			String s1 = br.readLine();
			String s2 = br.readLine();
			int cnt=0;
			for(int i=0; i<n; i++) {
				if(s1.charAt(i)==s2.charAt(i)) cnt++;
			}
			bw.write("#"+tc+" "+cnt+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}