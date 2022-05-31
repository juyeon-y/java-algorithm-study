import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            bw.write("#"+tc+" ");
            String n = br.readLine();
            if(n.equals("0")){
                bw.write("0 0\n");
                continue;
            }
            int len = n.length();
            char[] arr = n.toCharArray();
            for(int i=0; i<len-1; i++){
                int minIdx=i;
                for(int j=i+1; j<len; j++){
                    if(arr[minIdx]>=arr[j]){
                        if(i==0 && arr[j]=='0') continue;
                        minIdx=j;
                    }
                }
                if(arr[minIdx]!=arr[i]){
                    char tmp = arr[i];
                    arr[i] = arr[minIdx];
                    arr[minIdx] = tmp;
                    break;
                }
            }
            bw.write(String.valueOf(arr)+" ");
            arr = n.toCharArray();
            for(int i=0; i<len-1; i++){
                int maxIdx=i;
                for(int j=i+1; j<len; j++){
                    if(arr[maxIdx]<=arr[j]) maxIdx=j;
                }
                if(arr[maxIdx]!=arr[i]){
                    char tmp = arr[i];
                    arr[i] = arr[maxIdx];
                    arr[maxIdx] = tmp;
                    break;
                }
            }
            bw.write(String.valueOf(arr)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}