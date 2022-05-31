import java.io.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] dx = {0, 1, 1, 1};
		int[] dy = {1, 0, -1, 1};
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			int n = Integer.parseInt(br.readLine());
			char[][] board = new char[n][n];
			for(int i=0; i<n; i++) {
				String s = br.readLine();
				for(int j=0; j<n; j++) {
					board[i][j] = s.charAt(j);
				}
			}
			boolean flag = false;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(flag) break;
					if(board[i][j]=='o') {
						for(int k=0; k<4; k++) {
							int x=i, y=j, cnt=0;
							for(int m=0; m<4; m++) {
								x = x+dx[k];
								y = y+dy[k];
								if(x<0||x>=n||y<0||y>=n||board[x][y]=='.') break;
								cnt++;
							}
							if(cnt==4) {
								flag=true;
								break;
							}
						}
					}
				}
			}
			if(flag) bw.write("#"+tc+" YES\n");
			else bw.write("#"+tc+" NO\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}