import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int n = Integer.parseInt(br.readLine());
	    String exp = br.readLine();
	    int[] operand = new int[n];
	    Stack<Double> stack = new Stack<>();
	    for(int i=0; i<n; i++) operand[i] = Integer.parseInt(br.readLine());
	    for(char c : exp.toCharArray()){
	        if(Character.isAlphabetic(c)) stack.push((double)operand[c-65]);
	        else{
	            double op2 = stack.pop();
	            double op1 = stack.pop();
	            if(c=='+') stack.push(op1+op2);
	            else if(c=='-') stack.push(op1-op2);
	            else if(c=='*') stack.push(op1*op2);
	            else stack.push(op1/op2);
	        }
	    }
	    bw.write(String.format("%.2f", stack.pop()));
	    br.close();
	    bw.flush();
	    bw.close();
	}
}