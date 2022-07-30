import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine();
		int[] cnt = new int[26];
		for(char c : word.toCharArray()){
		    if(c>=65 && c<=90){
		        cnt[c-65]++;
		    }else{
		        cnt[c-97]++;
		    }
		}
		int alpCnt=0;
		char mostUsedAlp=' ';
		int mostUsedCnt=0;
		for(int i=0; i<26; i++){
		    if(cnt[i]>mostUsedCnt){
		        mostUsedCnt=cnt[i];
		        mostUsedAlp=(char)(i+65);
		        alpCnt=1;
		        
		    }else if(cnt[i]==mostUsedCnt){
		        alpCnt++;
		    }
		}
		if(alpCnt>1) bw.write("?");
		else bw.write(String.valueOf(mostUsedAlp));
		br.close();
		bw.flush();
		bw.close();
		
	}
}