import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            bw.write("#"+tc+" ");
            int n = Integer.parseInt(br.readLine());
            char[][] board = new char[n][n];
            int cnt=0, fx=-1, fy=-1;
            for(int i=0; i<n; i++){
                String tmp = br.readLine();
                for(int j=0; j<n; j++){
                    board[i][j] = tmp.charAt(j);
                    if(board[i][j]=='#'){
                        if(fx==-1 && fy==-1){
                            fx = i;
                            fy = j;
                        }
                        cnt++;
                    }
                }
            }
            int length = (int)Math.sqrt(cnt);
            if(cnt!=length*length){
                bw.write("no\n");
                continue;
            }
            boolean isSquare = true;
            for(int i=0; i<length; i++){
                for(int j=0; j<length; j++){
                    int nx=fx+i;
                    int ny=fy+j;
                    if(nx>=n || ny>=n) isSquare = false;
                    else if(board[nx][ny]!='#') isSquare = false;
                }
            }
            if(isSquare) bw.write("yes\n");
            else bw.write("no\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
//문제에서 cnt==1일때도 정사각형으로 봐서 계속 틀렸음.