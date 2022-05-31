import java.io.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			String s = new StringBuilder(br.readLine()).reverse().toString();
			StringBuilder sb = new StringBuilder();
			for(char c : s.toCharArray()) {
				if(c=='b') sb.append('d');
				else if(c=='d') sb.append('b');
				else if(c=='p') sb.append('q');
				else sb.append('p');
			}
			bw.write("#"+tc+" "+sb+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}