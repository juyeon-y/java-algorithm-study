import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int revA=0, revB=0;
		while(a!=0){
		    revA*=10;
		    revA+=a%10;
		    a/=10;
		}
		while(b!=0){
		    revB*=10;
		    revB+=b%10;
		    b/=10;
		}
		if(revA>revB) System.out.println(revA);
		else System.out.println(revB);
		sc.close();
	}
}