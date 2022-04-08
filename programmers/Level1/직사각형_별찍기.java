import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) sb.append('*');
        for(int i=0; i<m; i++) System.out.println(sb); // '객체 + 문자열' 연산이나 객체를 출력하는 경우, 객체의 toString() 메소드가 자동 호출됨
    }
}