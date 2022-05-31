import java.io.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			String p = br.readLine();
			String q = br.readLine();
			if(q.length()==1) bw.write("#"+tc+" Y\n");
			else if(p.equals(q.substring(0,q.length()-1)) && q.charAt(q.length()-1)=='a') {
				bw.write("#"+tc+" N\n");
			}
			else bw.write("#"+tc+" Y\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}