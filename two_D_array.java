import java.util.Scanner;
public class two_D_array {
    public static void main(String[] args) {
        int[][] arr=new int[4][5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.print("Enter the marks of Subject "+(i+1)+" - ");
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Part - 1");
        for(int i=0;i<5;i++) {
            float sum = 0.0F;
            for (int j=0;j<4;j++){
                sum += arr[j][i];
            }
            System.out.println("Average of marks of a subject is"+(sum/4));
        }
        System.out.println("Part - 2");
        int k=0;
        for(int i=0;i<4;i++) {
            float sum = 0.0F;
            for (int j = 0; j < 5; j++) {
                sum += arr[i][j];
            }
            float avg=sum/5;
            System.out.println("Average of marks of a student is"+(avg));
            if(avg<=50){
                k+=1;
            }
        }
        System.out.println("Part - 3");
        System.out.println("students scored below 50 in their average ."+k);
        System.out.println("Part - 4");
        for(int i=0;i<4;i++){
            System.out.print("scores obtained by student "+(i+1)+" is - ");
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}