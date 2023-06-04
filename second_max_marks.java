import java.util.Scanner;
public class second_max_marks{
    private String name;
    private int roll_no,marks;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll_no() {
        return roll_no;
    }
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public static void main(String[] args) {
        second_max_marks arr[]=new second_max_marks[3];     //Array initialization
        Scanner sc=new Scanner(System.in);
        int max=0;
        for(int i=0;i<3;i++){
            arr[i]=new second_max_marks();
            arr[i].setRoll_no(sc.nextInt());
            sc.nextLine();
            arr[i].setName(sc.nextLine());
            arr[i].setMarks(sc.nextInt());
            int k=arr[i].getMarks();
            if(max<k){
                max=k;
            }
        }
        int second_max=0;
        int index=0;
        for(int i=0;i<3;i++){
            int z=arr[i].getMarks();
            if((second_max < z) && (z != max)){
                second_max=z;
                index=i;
            }
        }
       System.out.println("Second highest"+"\nroll no ="+arr[index].getRoll_no()+"\nname = "+arr[index].getName()+"\nmarks = "+arr[index].getMarks());
    }
}