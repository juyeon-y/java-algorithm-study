import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char a = st.nextToken().charAt(0);
        char b = st.nextToken().charAt(0);
        if(a=='1' && b=='3') bw.write("A");
        else if(a=='2' && b=='1') bw.write("A");
        else if(a=='3' && b=='2') bw.write("A");
        else bw.write("B");
        br.close();
        bw.flush();
        bw.close();
    }
}