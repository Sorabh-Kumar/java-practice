import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }
        for(int v: arr)
            System.out.print(v+" ");
        //sorting
        for(int i = 1; i <=n-1; i++){
            int puc = arr[i];
            int j;
            for(j= i-1; j>=0 && arr[j]>puc; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1]  = puc;
        }
        for(int v: arr)
            System.out.print(v+" ");
}
}