import java.util.*;
public class pattern_zero {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    if(j==1||j==i)
                        System.out.print(i+"	");
                    else
                        System.out.print("0	");
                }
                System.out.println();
            }
        }
    }