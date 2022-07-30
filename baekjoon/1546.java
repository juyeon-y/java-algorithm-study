import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max=0;
		double total=0;
		int[] scores = new int[n];
		for(int i=0; i<n; i++){
		    scores[i]=sc.nextInt();
		    if(max<scores[i]) max=scores[i];
		}
		for(int x : scores){
		    total+=(double)x/max*100;
		}
		System.out.println(total/n);
		sc.close();
	}
}