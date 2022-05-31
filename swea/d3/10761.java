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
			int n = Integer.parseInt(st.nextToken());
			int curB=1, curO=1, total=0, timeLeftB=0, timeLeftO=0;
			for(int i=0; i<n; i++) {
				char robot = st.nextToken().charAt(0);
				int button = Integer.parseInt(st.nextToken());
				if(robot=='B') {
					int moveTime = Math.max(Math.abs(curB-button)-timeLeftB, 0);
					timeLeftB=0;
					timeLeftO+=moveTime+1;
					total+=moveTime+1;
					curB=button;
				}
				else {
					int moveTime = Math.max(Math.abs(curO-button)-timeLeftO, 0);
					timeLeftO=0;
					timeLeftB+=moveTime+1;
					total+=moveTime+1;
					curO=button;
				}
			}
			bw.write("#"+tc+" "+total+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}