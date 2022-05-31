import java.io.*;
import java.util.*;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			String s = br.readLine();
			HashMap<Character, Integer> map = new HashMap<>();
			for(char c : s.toCharArray()) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			if(map.size()==2) {
				boolean flag = true;
				for(Map.Entry<Character, Integer> entry : map.entrySet()) {
					if(entry.getValue()!=2) {
						flag=false;
						break;
					}
				}
				if(flag) {
					bw.write("#"+tc+" Yes\n");
					continue;
				}
			}
			bw.write("#"+tc+" No\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}