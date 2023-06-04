import java.util.Scanner;
public class GreetName {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("What is your name ?");
        String str = x.nextLine();
        System.out.println("Hello "+str+" Have a nice day !");
//        System.out.println(str);            // to have  multiline comment at a time we use ctrl+/
//        System.out.println("Have a nice day !");
    }
}
