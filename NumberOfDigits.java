import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int c=0;
        while(a>0){
            a=a/10;
            c++;
        }
        System.out.print("Number of digits are : "+c);
    }
}
