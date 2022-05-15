import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            String tmp = br.readLine();
            int cnt=0;
            for(char c : tmp.toCharArray()){
                if(c=='(') cnt++;
                else{
                    cnt--;
                    if(cnt<0) break;
                }
            }
            if(cnt==0) bw.write("YES\n");
            else bw.write("NO\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}