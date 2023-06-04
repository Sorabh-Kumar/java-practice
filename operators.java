import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = x.nextInt();
        System.out.print("Enter the second number :");
        int b = x.nextInt();
        int c = a+b;
        int d = a/b;   // returns actual value
        int e = a%b;   // returns remainder
        int f = a-b;
        int g = a*b;
        System.out.print("c is:"+c+" d is:"+d+" e is:"+e+" f is:"+f+" g is:"+g);
    }
}
