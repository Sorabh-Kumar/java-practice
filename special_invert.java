import java.util.*;
public class special_invert {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		int x = 0;
		int a = 0;
		while(n !=0){
			x = n%10;
			c +=1;
            int r = 1;
			n /=10;
			while(x !=0){
				r *= 10;
				x--;
			}
			 a = a +c*r;
		}
        a = a/10;
		System.out.println(a);
    }
}