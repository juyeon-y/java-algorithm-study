import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        StringTokenizer st;
        for(int tc=1; tc<=T; tc++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            ArrayList<Integer> scores = new ArrayList<>();
            int k_score=0;
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int total = a*35+b*45+c*20;
                scores.add(total);
                if(i==k-1) k_score=total;
            }
            Collections.sort(scores, Collections.reverseOrder());
            String answer = grade[scores.indexOf(k_score)/(n/10)];
            bw.write("#"+tc+" "+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

//K 번째 학생의 총점과 다른 학생의 총점이 동일한 경우는 입력으로 주어지지 않아 이 풀이가 가능.