import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int num=1;
        bw.write(num+" ");
        for(int i=0; i<n; i++){
            num*=2;
            bw.write(num+" ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}