import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=1; i<=t; i++){
            int n = Integer.parseInt(br.readLine());
            int dist = 0, speed=0;
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                char cmd = st.nextToken().charAt(0);
                if(cmd=='1') speed+=Integer.parseInt(st.nextToken());
                else if(cmd=='2') speed = Math.max(speed-=Integer.parseInt(st.nextToken()),0);
                dist+=speed;
            }
            bw.write("#"+i+" "+dist+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}