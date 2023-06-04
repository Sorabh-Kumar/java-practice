import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter maximum marks :");
        float max = x.nextInt();
        System.out.print("Enter the marks of subjects :");
        float maths = x.nextInt();
        float english = x.nextInt();
        float science = x.nextInt();
        float hindi = x.nextInt();
        float sst = x.nextInt();
        float percentage = (maths+english+sst+hindi+science)/5;
        System.out.println("Percentage of student is :");
        System.out.print(percentage);

    }
}
