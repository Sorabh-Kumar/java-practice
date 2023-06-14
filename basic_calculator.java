import java.util.*;
public class basic_calculator{

    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int flag=0;
        do{
		int res=0;
		char ch=scn.next().charAt(0);
		if(ch=='+'){
            int a=scn.nextInt();
		int b=scn.nextInt();
		res=a+b;
		System.out.println(res);
		}
		else if(ch=='-'){
            int a=scn.nextInt();
		int b=scn.nextInt();
		res=a-b;
		System.out.println(res);
		}
		else if(ch=='*'){
            int a=scn.nextInt();
		int b=scn.nextInt();
		res=a*b;
		System.out.println(res);
		}
		else if(ch=='/'){
            int a=scn.nextInt();
		int b=scn.nextInt();
		res=a/b;
		System.out.println(res);
		}
		else if(ch=='x' || ch=='X'){
			flag=1;
		}
		else{
			System.out.println("Invalid operation. Try again.");
		}
		}while(flag!=1);
    }
}