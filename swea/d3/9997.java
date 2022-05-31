import java.io.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			int angle = Integer.parseInt(br.readLine());
			int min = angle*2;
			int hour = min/60%12;
			min = min%60;
			bw.write("#"+tc+" "+hour+" "+min+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}