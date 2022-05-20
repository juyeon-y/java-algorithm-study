import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=1; i<=t; i++){
            bw.write("#"+i+" ");
            int[][] arr = new int[9][9];
            boolean overlap = false;
            for(int j=0; j<9; j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<9; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            for(int j=0; j<9; j++){
                int chk=0;
                for(int k=0; k<9; k++) chk |= (1<<arr[j][k]);
                if(chk!=1022){
                    overlap = true;
                    break;
                }
            }
            for(int k=0; k<9; k++){
                int chk=0;
                for(int j=0; j<9; j++) chk |= (1<<arr[j][k]);
                if(chk!=1022){
                    overlap = true;
                    break;
                }
            }
            for(int m=0; m<9; m++){
                int x=(m/3)*3;
                int y=(m%3)*3;
                int chk=0;
                for(int j=0; j<3; j++){
                    for(int k=0; k<3; k++){
                        chk |= (1<<arr[x+j][y+k]);
                    }
                }
                if(chk!=1022){
                    overlap = true;
                    break;
                }
            }
            if(overlap) bw.write(0+"\n");
            else bw.write(1+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

//입력받으면서 row 검사 동시에 했더니 입력 다 못받은 채로 break로 빠져나오게 되는 경우 생기고, 이렇게 될 경우 사이트에서 오답으로 처리되어서 좀 헤맸음.
//매 테스트 케이스마다 초기화해야 하는 것들 중 빼먹은 것 없나 잘 살피기.