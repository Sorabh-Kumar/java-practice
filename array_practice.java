import java.util.Scanner;

public class array_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] n = new int[a];
        for(int i =0; i<n; i++){
            n[i]= sc.nextInt();
        }
        for(int v: n){
            System.out.println(v);
        }
        System.out.println("enter value to search");
        int x = sc.nextInt();
    }
}
