import java.util.Scanner;

public class max_path_array {
    public static void max_path(int [] a, int [] b){
        int x = a.length;
        int y = b.length;
        int i = 0, j=0, r=0, s1=0, s2=0;
        while(i<x && j<y){
            if(a[i]> b[j]){
                s2 = s2 + b[j];
                j++;
            }
            else if(a[i]< b[j]){
                s1 = s1 + a[i];
                i++;
            }
            else if(a[i]==b[j]){
                r = r+ Math.max(s1, s2) + a[i];
                s1 = 0;
                s2 = 0;
                i++;
                j++;
            }
        }
		while(i<x){
			s1 = s1+a[i];
			i++;
		}
		while(j<y){
			s2 = s2+b[j]; 
			j++;
		}
		r = r+ Math.max(s1, s2);
        System.out.println(r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int [] n = new int[a];
            int [] m = new int[b];
                for(int i =0; i<a; i++){
                    n[i]= sc.nextInt();
                }
                 for(int i =0; i<a; i++){
                    m[i]= sc.nextInt();
                }
            max_path(n, m);
        }
    }
}