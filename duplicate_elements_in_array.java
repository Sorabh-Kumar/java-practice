import java.util.Scanner;
public class duplicate_elements_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array - ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements of array - ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    k++;
                    if(k==1){
                        System.out.print("Yes the duplicate elements are present whose indexes are - ");
                    }
                    System.out.print(i+" "+j);
                }
            }
        }
    }
}
