import java.io.*;
class Solution {
    private static int[] chk;
    private static char[] val;
    private static boolean flag;
    private static void dfs(int lev, String n, int len){
        if(flag) return;
        if(lev==len){
            int newNum = Integer.parseInt(String.valueOf(val));
            int num = Integer.parseInt(n);
            if(newNum!=num && newNum%num==0) flag=true;
        }
        else{
            for(int i=0; i<len; i++){
                if(chk[i]==0){
                    chk[i]=1;
                    val[lev]=n.charAt(i);
                    dfs(lev+1, n, len);
                    chk[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            flag = false;
            String n = br.readLine();
            int len = n.length();
            chk = new int[len];
            val = new char[len];
            dfs(0, n, len);
            if(flag) bw.write("#"+tc+" possible\n");
            else bw.write("#"+tc+" impossible\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}