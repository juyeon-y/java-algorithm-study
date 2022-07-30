import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total=1;
		for(int i=0; i<3; i++){
		    total*=sc.nextInt();
		}
		int[] cnt = new int[10];
		while(total!=0){
		    cnt[total%10]++;
		    total/=10;
		}
		for(int x : cnt){
		    System.out.println(x);
		}
		sc.close();
	}
}