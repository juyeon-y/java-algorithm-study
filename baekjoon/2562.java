import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=0, order=0;
		for(int i=1; i<=9; i++){
		    int n = sc.nextInt();
		    if(n>max){
		        max=n;
		        order=i;
		    }
		}
		System.out.print(max+"\n"+order);
	}
}