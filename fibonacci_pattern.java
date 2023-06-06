import java.util.*;
public class fibonacci_pattern {
	static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(fib(a)+"	");
				a++;
			}
			System.out.println();
		}
    }
}