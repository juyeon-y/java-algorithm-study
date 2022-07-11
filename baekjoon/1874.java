import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n ;i++) arr[i] = Integer.parseInt(br.readLine());
		int input = 1;
		boolean impossible = false;
		for(int i=0; i<n; i++){
		    while(input<=arr[i]){
		        stack.push(input++);
		        sb.append("+\n");
		    }
		    if(!stack.isEmpty() && stack.peek()==arr[i]){
		        stack.pop();
		        sb.append("-\n");
		    }
		    else{
		        impossible = true;
		        break;
		    }
		}
		if(impossible) bw.write("NO");
		else bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}
}