import java.io.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[12];
			for(int i=2; i<=11; i++) {
				if(i==10) arr[i]=16;
				else arr[i]=4;
			}
			int sum=0, cnt1=0, cnt2=0;
			for(int i=0; i<n; i++) {
				int card = Integer.parseInt(br.readLine());
				arr[card]--;
				sum+=card;
			}
			for(int i=2; i<=11; i++) {
				if(sum+i>21) cnt1+=arr[i];
				else cnt2+=arr[i];
			}
			if(cnt1>=cnt2) bw.write("#"+tc+" STOP\n");
			else bw.write("#"+tc+" GAZUA\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}