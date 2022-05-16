import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] arr = {2, 3, 5, 7, 11};
        for(int i=1; i<=t; i++){
           int n = Integer.parseInt(br.readLine());
           int[] answer = new int[5];
           bw.write("#"+i+" ");
           for(int j=0; j<5; j++){
               while(n%arr[j]==0){
                   answer[j]++;
                   n/=arr[j];
               }
               bw.write(answer[j]+" ");
           }
           bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}