import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=1; j<= n-i+1; j++){
				System.out.print(j+" ");
			}
			for(int s=1; s<=2*i-3 ;s++)
				System.out.print("* ");
		System.out.println();
		}
    }
}