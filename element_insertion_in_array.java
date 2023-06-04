/*
public class element_insertion_in_array{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int index=1;
        int value=100;
        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=value;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
*/
import java.util.*;
public class element_insertion_in_array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array 1 : ");
        int m=sc.nextInt();
        System.out.print("Enter the size of array 2 : ");
        int n=sc.nextInt();
        int k=0;
        int[] arr1=new int[m];
        int[] arr2=new int[n];
        int[] arr3=new int[m+n];
        System.out.println("Enter elements of array 1 : ");
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of array 2 : ");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<(m+n);i++){
            if(i<m){
                arr3[i]=arr1[i];
            }
            else{
                arr3[i]=arr2[k];
                k++;
            }
        }
        System.out.println("Merged array is : ");
        for(int i=0;i<(m+n);i++){
            System.out.print(arr3[i]+" ");
        }
    }
}