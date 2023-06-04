import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle :");
        int L=sc.nextInt();
        System.out.print("Enter the breadth of the rectangle:");
        int B=sc.nextInt();
        int area=L*B;
        System.out.print("area of the rectangle is :"+area);
    }
}
