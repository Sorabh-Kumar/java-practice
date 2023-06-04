import java.util.Scanner;
public class cuboid {
    public static void main(String args[]){
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side of cuboid");
        a= sc.nextFloat();
        b= sc.nextFloat();
        c= sc.nextFloat();
        float tsa, volume;
        tsa= 2f*((a*b)+(b*c)+(c*a));
        volume = a*b*c;
        System.out.println("total surface area is "+tsa+"and volume is "+volume);
    }
}
