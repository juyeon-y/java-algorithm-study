import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            int n = Integer.parseInt(br.readLine());
            int chk = 0, cnt=0;
            while(chk!=1023){
                int tmp = n*(++cnt);
                while(tmp>0){
                    chk|=(1<<(tmp%10));
                    tmp/=10;
                }
            }
            bw.write("#"+i+" "+(cnt*n)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}