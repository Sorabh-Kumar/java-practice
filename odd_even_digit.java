import java.util.*;
public class odd_even_digit {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t =0;
		int c = 0;
		int a = 0;
		int b = 0;
		while(n!=0){
			t = n%10;
			n /= 10;
			c++;
			if(c%2==0){
				b += t; 
			}
			else{
				a += t;
			}
		}
		System.out.println(a);
		System.out.println(b);
    }
}