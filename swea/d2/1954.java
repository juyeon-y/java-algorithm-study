import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];
            int x=0, y=-1;
            int num=1, di=0;
            while(num<=n*n){
                int nx = x+dx[di];
                int ny = y+dy[di];
                if(nx>=n || nx<0 || ny>=n || ny<0 || arr[nx][ny]!=0){
                    di = (di+1)%4;
                    continue;
                }
                x=nx;
                y=ny;
                arr[x][y]=num++;
            }
            bw.write("#"+i+"\n");
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    bw.write(arr[j][k]+" ");
                }
                bw.write("\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}