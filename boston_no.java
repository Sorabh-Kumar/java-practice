import java.util.*;
public class boston_no {
	public static long primesum(long n){
		long a = n;
		long sum = 0;
		for(long i = 2; i<=n; i++){
			while(n%i ==0){
				if (i < 10){
					sum = sum +i;
					n = n/i;
				}
				else{
					n = n/i;
					long t = 0;
					long j = i; 
					while(j>0){
						t = j%10;
						j = j/10;
						sum = sum + t;
					}
				}
			}
		}
		return sum;
	}
	public static long dig(long n){
		long t = 0;
		long r = 0;
		while(n>0){
			t = n%10;
			n /= 10;
			r = r + t;
		}
		return r;
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		if(dig(n)== primesum(n))
			System.out.println(1);
		else
			System.out.println(0);
    }
}