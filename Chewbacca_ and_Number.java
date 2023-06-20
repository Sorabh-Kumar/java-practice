import java.util.*;
public class Chewbacca_and_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long t = 0;
		long m = 0;
		long x = 1; 
		long c = 0;
		while(n>0){
			t = n%10;
			n = n/10;
			c = 9-t;
			if(t<c || (n ==0 && t==9)){
				m += t*x;
			}
			else{
				m += c*x;
			}
			x *=10;
		}
		System.out.println(m);
    }
}