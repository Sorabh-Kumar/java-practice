import java.util.Scanner;
public class Recurrsion_Fibonacci {
    static int nth_Term(int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return nth_Term(n-1)+nth_Term(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto where the fibonacci series need to be printed :\n ");
        int x=nth_Term(sc.nextInt());
        System.out.println(x);
    }
}
