import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++){
		    int r = sc.nextInt();
		    String s = sc.next();
		    for(char c : s.toCharArray()){
		        for(int i=0; i<r; i++){
		            System.out.print(c);
		        }
		    }
		    System.out.println();
		}
		sc.close();
	}
}