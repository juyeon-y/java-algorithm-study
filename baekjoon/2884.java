import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(m<45){
		    if(h==0) h=23;
		    else h-=1;
		    m=m+60-45;
		}
		else{
		    m-=45;
		}
		System.out.println(h+" "+m);
		sc.close();
	}
}