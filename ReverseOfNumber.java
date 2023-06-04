import java.util.Scanner;
public class ReverseOfNumber {
    public static void main(String[] args) {
        int a,rem=0,rev=0,n;
        System.out.print("Enter the number : ");
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        a=n;
        while(a!=0){
            rem=a%10;
            rev=rev*10+rem;
            a/=10;
        }
        System.out.print("Reverse of "+n+" is "+rev);
    }
}
