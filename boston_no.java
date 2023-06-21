import java.util.*;
public class boston_no {
	public static int fac(int n ){
		int a = n;
		int t = 0;
		for(int i =2; i < a; i++ ){
			while(n%i ==0){
				t = t+i;
				n /= i;
			}
		}
		return t;
	}
	public static int dig(int n){
		int t = 0;
		int r = 0;
		while(n>0){
			t = n%10;
			n /= 10;
			r = r + t;
		}
		return r;
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(dig(n));
		System.out.println(fac(n));
    }
}