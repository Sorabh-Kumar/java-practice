import java.util.InputMismatchException;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        int a;
        int b;
        int[] arr={1,2,3,4,5,5,6};
        try(Scanner s =new Scanner(System.in)){
            a = s.nextInt();
            b = s.nextInt();
            int index = s.nextInt();
            System.out.println(a/b);
            System.out.println(arr[index]);
        }
        catch(ArithmeticException | InputMismatchException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}