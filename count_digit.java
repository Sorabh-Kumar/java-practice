import java.util.*;
public class count_digit {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = 0;
		int t = 0;
		while(n>0){
			t = n%10;
			n /=10;
			if (t== m ){
				c++;
			}
		}
		System.out.println(c);
    }
}