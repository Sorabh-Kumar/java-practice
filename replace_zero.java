import java.util.*;
public class replace_zero {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long t = 0;
		long m = 0;
		long x = 1;
		if(n==0){
			System.out.println("5");
		}
		else {
		while(n>0){
			t = n%10;
			n = n/10;
			if(t==0 && n!=0 ){
				t = 5;
			}
			m += t*x;
			x *=10; 
		}
		System.out.println(m);
		}
    }
}