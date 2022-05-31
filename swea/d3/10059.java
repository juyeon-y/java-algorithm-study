import java.io.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			bw.write("#"+tc+" ");
			String tmp = br.readLine();
			int front = Integer.parseInt(tmp.substring(0,2));
			int back = Integer.parseInt(tmp.substring(2,4));
			if(front>=1 && front<=12 && back>=1 && back<=12) {
				bw.write("AMBIGUOUS\n");
			}
			else if(front>=1 && front<=12) bw.write("MMYY\n");
			else if(back>=1 && back<=12) bw.write("YYMM\n");
			else bw.write("NA\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}