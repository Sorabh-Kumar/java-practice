import java.util.Scanner;
public class INPUT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();   // To take integer as input
        System.out.println("Enter the decimal: ");
        float decimal=sc.nextFloat();     // To take float as input
        System.out.println("Enter the double_float: ");
        double double_float=sc.nextDouble();      // To take double float as input
        System.out.println("Enter the name: ");
        String name=sc.next();                    // To take string as input
        System.out.println("Entered number is : "+number);
        System.out.println("Entered name is : "+name);
        System.out.println("Entered decimal is : "+decimal);
        System.out.println("Entered double_float is : "+double_float);

        System.out.println("Enter the array: ");
        int[] arr=new int[3];    // We declare array with name arr
        for (int i=0;i<3;i++){
            arr[i]=sc.nextInt();   // Taking elements of array as input
        }
        for (int e:arr){            // Short form of the loop
            System.out.println(e);     // Printing the elements of array
        }
    }
}