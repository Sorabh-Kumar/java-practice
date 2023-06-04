import java.util.*;
public class robot_direction{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Grid : ");
        int X=sc.nextInt();
        int Y=sc.nextInt();
        System.out.print("Enter the current position : ");
        int Xp=sc.nextInt();
        int Yp=sc.nextInt();
        System.out.print("Enter the current face position : ");
        String Fd=sc.next();
        String Cd=Fd;
        System.out.print("Enter the Operations : ");
        String str1=sc.next();
        String[] str2=str1.split(" ");
        for(String str:str2){
            if(str.equals("R")||str.equals("L")){
                if(Cd.equals("E")){
                    if(str.equals("R"))
                        Cd="S";
                    else
                        Cd="N";
                }
                if(Cd.equals("N")){
                    if(str.equals("R"))
                        Cd="E";
                    else
                        Cd="W";
                }
                if(Cd.equals("W")){
                    if(str.equals("R"))
                        Cd="N";
                    else
                        Cd="S";
                }
                if(Cd.equals("S")){
                    if(str.equals("R"))
                        Cd="W";
                    else
                        Cd="E";
                }
            }
            else if(str.equals("M")){
                if(Cd.equals("E"))
                    Xp+=1;
                else if(Cd.equals("N"))
                    Yp+=1;
                else if(Cd.equals("W"))
                    Xp-=1;
                else if(Cd.equals("S"))
                    Yp-=1;
            }
        }
        System.out.print(Xp+"-"+Yp+"-"+Cd);
        if(Xp>X || Yp>Y)
            System.out.print("Er");
    }
}