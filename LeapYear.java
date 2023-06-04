import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter the year you want ot check :");
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        if(((a%4==0)&&a%100!=0)||(a%400==0)){
            System.out.print("It is a leap year");
        }
        else{
            System.out.println("This is not a leap year");
        }
    }
}
