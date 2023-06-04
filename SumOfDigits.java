import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        int a,r,sum=0;
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number : ");
        a=x.nextInt();
        while(a>0){
            r=a%10;
            sum+=r;
            a/=10;
        }
        System.out.print("Sum of digits is : "+sum);
    }
}
