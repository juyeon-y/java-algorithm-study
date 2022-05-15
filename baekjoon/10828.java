import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int top = -1;
        String[] stack = new String[n];
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push")) stack[++top] = st.nextToken();
            else if(cmd.equals("pop")){
                if(top==-1) bw.write("-1\n");
                else bw.write(stack[top--]+"\n");
            }
            else if(cmd.equals("size")){
                int size = top+1;
                bw.write(size+"\n");
            }
            else if(cmd.equals("empty")){
                if(top==-1) bw.write("1\n");
                else bw.write("0\n");
            }
            else{
                if(top==-1) bw.write("-1\n");
                else bw.write(stack[top]+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}