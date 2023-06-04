import java.util.Scanner;
public class trianglearea2 {
    public static void main(String args[]) {
        float a, b, c, s;
        double area;
        System.out.println("Enter value of sides of triangle");
        Scanner sc = new Scanner(System.in);
        a= sc.nextFloat();
        b= sc.nextFloat();
        c= sc.nextFloat();
        s=(a+b+c)/2f;
        area=  Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
}
