import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        for(int i=0; i<7; i++) map.put(days[i], 7-i);
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            String day = br.readLine();
            bw.write("#"+tc+" "+map.get(day)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}