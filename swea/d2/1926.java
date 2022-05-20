import java.io.*;
import java.util.regex.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Pattern pattern = Pattern.compile("[369]");
        Matcher matcher;
        for(int i=1; i<=n; i++){
            int cnt=0;
            matcher = pattern.matcher(String.valueOf(i));
            while(matcher.find()){
                cnt++;
                bw.write("-");
            }
            if(cnt==0) bw.write(i+" ");
            else bw.write(" ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}