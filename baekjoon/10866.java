import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] deque = new int[10000];
		int front = 0, back = 0, size = 0;
		for(int i=0; i<n; i++){
		    st = new StringTokenizer(br.readLine());
		    String cmd = st.nextToken();
		    if(cmd.equals("push_front")){
		        deque[front] = Integer.parseInt(st.nextToken());
		        front = (front-1+10000) % 10000;
		        size++;
		    }
		    else if(cmd.equals("push_back")){
		        back = (back+1) % 10000;
		        deque[back] =  Integer.parseInt(st.nextToken());
		        size++;
		    }
		    else if(cmd.equals("pop_front")){
		        if(front==back) bw.write("-1\n");
		        else{
		            front = (front+1) % 10000;
		            bw.write(deque[front]+"\n");
		            size--;
		        }
		    }
		    else if(cmd.equals("pop_back")){
		        if(front==back) bw.write("-1\n");
		        else{
		            bw.write(deque[back]+"\n");
		            back = (back-1+10000) % 10000;
		            size--;
		        }
		    }
		    else if(cmd.equals("size")){
		        bw.write(size+"\n");
		    }
		    else if(cmd.equals("empty")){
		        if(front==back) bw.write("1\n");
		        else bw.write("0\n");
		    }
		    else if(cmd.equals("front")){
		        if(front==back) bw.write("-1\n");
		        else bw.write(deque[(front+1)%10000]+"\n");
		    }
		    else{
		        if(front==back) bw.write("-1\n");
		        else bw.write(deque[back]+"\n");
		    }
		}
		br.close();
		bw.flush();
		bw.close();
	}
}