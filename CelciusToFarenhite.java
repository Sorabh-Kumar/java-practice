import java.util.Scanner;
public class CelciusToFarenhite {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the temperature in celcius:");
        float C= x.nextFloat();
        float F=32+(9*C)/5;
        System.out.print("Temperatue in farenhite is :"+F);
    }
}
