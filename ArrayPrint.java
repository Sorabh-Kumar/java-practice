import java.util.Scanner;
public class ArrayPrint {
    public static void main(String[] args) {
       // Method-1
        int [] marks=new int[5];
        marks[0]=50;
        marks[1]=60;
        marks[2]=70;
        marks[3]=80;
        marks[4]=90;
        System.out.print(marks[4]+"\n");
        marks[4]=96;
        System.out.print(marks[4]+"\n");
        //System.out.println(marks[5]);

        //Method-3
        int [] rollno;         // Declaration
        rollno=new int[5];     // Memory Allocation

        //Method-3
        int [] height={10,20,30,50};   // JAVA will automatically detect its size . We don't need to declare its size
        System.out.print(height.length+"\n");    // Return the length of array
        // We can have string of any Datatype

        //Example
        String [] subjects=new String[5];
        subjects[0]="maths";              //String element is always taken in double quotes  ""
        subjects[1]="hindi";
        subjects[2]="english";
        subjects[3]="science";
        subjects[4]="sanskrit";
        System.out.print(subjects[4]+"\n");
        subjects[4]="SSt";
        System.out.print(subjects[4]+"\n");


        System.out.print("------------------------------------------\n");

        //---------------------------------------------------------------------------

        // Displaying the array using for loop
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+"\n");
        }
        //Displaying the array in reverse order using for loop
        for(int j=(marks.length-1);j>=0;j--){
            System.out.print(marks[j]+"\n");
        }

        //Display array using for loop in simpler way
        for(int k: marks){                //It will automatically get all the elements of array from starting
            System.out.print(k+"\n");
        }


        //Taking array from the user
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int a=x.nextInt();
        int [] society=new int[a];
        for(int l=0;l<a;l++){
            society[l]=x.nextInt();
        }
        for(int z:society){
            System.out.print(z+"\n");
        }
    }
}