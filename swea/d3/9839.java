import java.io.*;
import java.util.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int tc=1; tc<=T; tc++) {
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
			int max = Integer.MIN_VALUE;
			for(int i=0; i<n; i++) {
				for(int j=i+1; j<n; j++) {
					int prod = arr[i]*arr[j];
					String s = String.valueOf(prod);
					boolean flag=true;
					for(int k=1; k<s.length(); k++) {
						if(s.charAt(k)!=s.charAt(k-1)+1) {
							flag=false;
							break;
						}
					}
					if(flag) {
						if(max<prod) max=prod;
					}
				}
			}
			if(max==Integer.MIN_VALUE) bw.write("#"+tc+" -1\n");
			else bw.write("#"+tc+" "+max+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}