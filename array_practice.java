import java.util.Scanner;

public class array_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] n = new int[a];
        for(int i =0; i<a; i++){
            n[i]= sc.nextInt();
        }
        for(int v: n){
            System.out.print(v+"    |");
        }
        System.out.println("enter value to search");
        int x = sc.nextInt();
        for(int i = 0; i<a; i++){
            if(n[i]==x){
                System.out.println("Match found on array index"+ i);
                break;
            }
            else if(i== (a-1)){
                System.out.println("No match found");
            }
        }
    }
}
