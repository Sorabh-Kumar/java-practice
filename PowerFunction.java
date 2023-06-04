import java.util.Scanner;
import java.lang.Math;
public class PowerFunction {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        double z=Math.pow(a,b);
        System.out.println(z);
    }
}
