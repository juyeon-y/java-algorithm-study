import java.io.*;
import java.util.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			bw.write("#"+tc+" ");
			String s = br.readLine();
			HashMap<Character, Integer> map = new HashMap<>();
			ArrayList<Character> leftCh = new ArrayList<>();
			for(char c : s.toCharArray()) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			for(Map.Entry<Character, Integer> e : map.entrySet()) {
				if(e.getValue()%2==1) leftCh.add(e.getKey());
			}
			if(leftCh.size()==0) bw.write("Good\n");
			else {
				Collections.sort(leftCh);
				for(char c : leftCh) {
					bw.write(String.valueOf(c));
				}
				bw.write("\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}