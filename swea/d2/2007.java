import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            String s = br.readLine();
            int answer=0;
            for(int i=1; i<=10; i++){
                if(s.substring(0,i).equals(s.substring(i,i*2))){
                    answer=i;
                    break;
                }
            }
            bw.write("#"+tc+" "+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}