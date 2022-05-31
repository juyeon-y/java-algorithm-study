import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++) {
            int n = Integer.parseInt(br.readLine());
            boolean flag = false;
            for(int a=1; a<=9; a++){
                if(n%a==0 && n/a>=1 && n/a<=9){
                    flag = true;
                    break;
                }
            }
            if(flag) bw.write("#"+tc+" Yes\n");
            else bw.write("#"+tc+" No\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}