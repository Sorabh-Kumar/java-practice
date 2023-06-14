import java.util.*;
public class binary_decimal {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = 0;
		int t = 0;
		int c = 0;
		while(n>0){
			t= n%10;
			n /= 10;
			d += t*Math.pow(2, c);
			c++;
		}
		System.out.println(d);
    }
}