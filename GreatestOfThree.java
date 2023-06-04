import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the numbers you want to compare :");
        int a=x.nextInt();
        int b=x.nextInt();
        int c=x.nextInt();
        int d=x.nextInt();
        if(a>b) {
            if (a>c) {
                if (a>d) {
                    System.out.print(a + " is the maximum");
                } else {
                    System.out.print(d + " is the maximum");
                }
            }
        }
        if(a>b){
            if(a>c) {
                if (a>d) {
                    System.out.print(a + " is the maximum");
                } else {
                    System.out.print(d + " is the maximum");
                }
            }
        }
        else if(b>c){
            if(b>d){
                System.out.println(b+" is the maimum");
            }
            else{
                System.out.println(d+" is the maximum");
            }
        }
        else if(c>d){
            System.out.println(c+" is the maximum");
        }
        else{
            System.out.println(d+" is the maximum");
        }
    }
}