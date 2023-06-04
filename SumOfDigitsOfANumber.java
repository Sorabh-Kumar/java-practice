import java.util.Scanner;
public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int sum=0,r;
        while(a>0){
            r=a%10;
            sum+=r;
            a=a/10;
        }
        System.out.print("Sum of digits of the number is : "+sum);
    }
}
