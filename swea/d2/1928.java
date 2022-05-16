import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            String tmp = br.readLine();
            StringBuilder answer = new StringBuilder();
            for(int j=0; j<tmp.length(); j+=4){
                StringBuilder sb = new StringBuilder();
                for(int k=j; k<j+4; k++){
                    char c = tmp.charAt(k);
                    int res=0;
                    if(c>=48 && c<=57) res=c+4;
                    else if(c>=65 && c<=90) res=c-65;
                    else if(c>=97 && c<=122) res=c-71;
                    else if(c=='+') res = 62;
                    else res=63;
                    for(int l=5; l>=0; l--){
                        if((res&(1<<l))!=0) sb.append(1);
                        else sb.append(0);
                    }
                }
                answer.append((char)Integer.parseInt(sb.substring(0,8),2));
                answer.append((char)Integer.parseInt(sb.substring(8,16),2));
                answer.append((char)Integer.parseInt(sb.substring(16,24),2));
            }
            bw.write("#"+i+" "+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}