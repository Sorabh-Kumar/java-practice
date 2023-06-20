import java.util.*;
public class odd_even_delhi {
	public static void fun(int n){
		int t=0;
		int o =0;
		int e =0;
		while(n>0){
			t = n%10;
			n = n/10;
			if( t%2==0)
				e +=t;
			else
				o +=t;
		}
		if( e%4==0 || o%3==0 )
			System.out.println("Yes");
		else
			System.out.println("No");
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1; i<=n; i++ ){
			int m = sc.nextInt();
			fun(m);
		}
    }
}