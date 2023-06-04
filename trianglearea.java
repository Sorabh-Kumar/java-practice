import java.util.Scanner;
public class trianglearea {
    public static void main(String args[]){
        float height, base, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value for height and base");
        height= sc.nextFloat();
        base=sc.nextFloat();
        area= (height*base)*0.5f;
        System.out.println(area);
    }
}
