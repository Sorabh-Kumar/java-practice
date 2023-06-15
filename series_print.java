import java.util.*;
public class series_print {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c =0;
		int a = 1;
		int s = 0;
		while(c !=n){
			s = 3*a +2;
			a++;
			if(s%m != 0){
				System.out.println(s);
				c++;
			}
		}
    }
}
