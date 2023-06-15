import java.util.*;
public class decimal_octal {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0;
		int c =1 ;
		int m =0;
		while(n>0){
			r = n%8;
			n /= 8;
			m += r*c;
			c *=10;
		}
		System.out.println(m);
    }
}
