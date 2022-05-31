import java.io.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			int a=1, b=1;
			String s = br.readLine();
			for(char c : s.toCharArray()) {
				if(c=='L') b=a+b;
				else a=a+b;
			}
			bw.write("#"+tc+" "+a+" "+b+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}