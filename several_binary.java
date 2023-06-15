import java.util.*;
public class several_binary {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0; i<n; i++){
			int b = sc.nextInt();
			int t = 0;
			int a = 0;
			int c = 1;
			while(b!=0){
				t = b%10;
				b /= 10;
				a += t*c;
				c *= 2;
			}
			System.out.println(a);
		}
    }
}