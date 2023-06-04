import java.lang.Math;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number you want ot check : ");
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int r,sum=0,i,n,c=0;
        n=a;
        while(n>0){
            c++;
            n/=10;
        }
        i=a;
        while(i>0){
            r=i%10;
            sum+=Math.pow(r,c);
            i/=10;
        }
        if(sum==a){
            System.out.print("It is a Armstrong Number ");
        }
        else{
            System.out.print("It is not a Armstrong Number ");
        }
    }
}
