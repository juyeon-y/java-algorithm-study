import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        bw.write(String.valueOf(sum));
        br.close();
        bw.flush();
        bw.close();
    }
}