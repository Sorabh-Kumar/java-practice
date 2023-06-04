import java.util.Scanner;
public record VolumeOfCylinder() {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the cylinder:");
        Scanner x=new Scanner(System.in);
        double r=x.nextFloat();
        System.out.print("Enter the height of the cylinder:");
        double h=x.nextFloat();
        double v=(3.14159)*r*r*h;
        System.out.println(v);
    }
}
