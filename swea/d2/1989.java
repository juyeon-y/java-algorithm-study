import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            bw.write("#"+tc+" ");
            String word = br.readLine();
            if(word.equals(new StringBuilder(word).reverse().toString())) bw.write("1\n");
            else bw.write("0\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}