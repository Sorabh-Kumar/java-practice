import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number you want to have the factorial : ");
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        double fact=1;
        for(int i=1;i<(a+1);i++){
            fact=fact*i;
        }
        System.out.print("Factorial of "+a+" is "+fact);
    }
}
