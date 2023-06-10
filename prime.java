import java.util.*;
public class prime {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c=0;
		int m = 2;
		while(m<n){
			if(n%m==0){
				c+=1;
			}
			m++;
		}
		if(c==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
    }
}