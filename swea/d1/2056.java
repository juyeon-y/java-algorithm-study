import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            bw.write("#"+i+" ");
            String tmp = br.readLine();
            String month = tmp.substring(4,6);
            String day = tmp.substring(6);
            int m = Integer.parseInt(month);
            int d = Integer.parseInt(day);
            if(m>=1 && m<=12 && d>=1 && d<=dayOfMonth[m-1]){
                bw.write(tmp.substring(0,4)+"/"+month+"/"+day+"\n");
            }
            else bw.write("-1\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}