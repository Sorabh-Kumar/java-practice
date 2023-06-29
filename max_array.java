import java.util.Scanner;

public class max_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for(int i =0; i<n; i++){
            if(a[i]> temp){
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
