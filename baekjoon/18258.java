import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] queue = new String[n];
        int front=0, back=0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push")) queue[back++]=st.nextToken();
            else if(cmd.equals("pop")){
                if(front==back) bw.write("-1\n");
                else bw.write(queue[front++]+"\n");
            }
            else if(cmd.equals("size")) bw.write(back-front+"\n");
            else if(cmd.equals("empty")){
                if(front==back) bw.write("1\n");
                else bw.write("0\n");
            }
            else if(cmd.equals("front")){
                if(front==back) bw.write("-1\n");
                else bw.write(queue[front]+"\n");
            }
            else{
                if(front==back) bw.write("-1\n");
                else bw.write(queue[back-1]+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}