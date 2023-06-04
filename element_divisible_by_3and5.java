import java.util.Scanner;
public class element_divisible_by_3and5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]%3==0 && arr[i]%5==0){
                System.out.print(arr[i] +" ");
            }
        }
    }
}
