import java.util.Scanner;
public class consecutive_duplicate_elements {
    public static int removeDuplicates(int a[], int n)
    {
        if (n==0 || n==1){
            return n;
        }
        int j=0;
        for (int i=0; i<n-1;i++) {
            if (a[i]!=a[i+1]){
                a[j++]=a[i];
            }
        }
        a[j++]=a[n-1];
        return j;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int j=removeDuplicates(a,n);
        for (int i=0;i<j;i++)
            System.out.print(a[i]+" ");
    }
}