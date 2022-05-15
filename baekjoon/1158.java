import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++) q.offer(i);
        while(true){
            for(int i=0; i<k-1; i++) q.offer(q.poll());
            sb.append(q.poll());
            if(!q.isEmpty()) sb.append(", ");
            else{
                sb.append(">");
                break;
            }
        }
        System.out.print(sb);
        br.close();
    }
}