import java.util.Scanner;
public class AdditionOfTwoNumbersUsingScanner {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = x.nextInt();
        System.out.print("Enter the second number :");
        int b = x.nextInt();
        int sum = a+b;
        System.out.print("The sum of the two numbers is :");
        System.out.println(sum);
        boolean c = x.hasNextInt();  // If the entered value is integer then it will return true else it will return false
        System.out.println(c);
        System.out.println("Enter a string");
        String str1 = x.next();   // If we enter more than one word the it will return only first word .
        System.out.println(str1);
        System.out.println("Enter next string ");
        String str2 = x.nextLine();
        System.out.println(str2);
    }
}
