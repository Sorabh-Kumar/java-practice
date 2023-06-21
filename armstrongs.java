import java.util.*;
public class armstrongs {
	public static boolean arm(int a){
        int r,sum=0,i,n,c=0;
        n=a;
        while(n>0){
            c++;
            n/=10;
        }
        i=a;
        while(i>0){
            r=i%10;
            sum+=Math.pow(r,c);
            i/=10;
        }
        if(sum==a){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int j=n; j<=m; j++){
			boolean a = arm( j);
			if(a == true){
				System.out.println(j);
		}
	}
}
}