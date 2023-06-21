import java.util.*;
public class shopping_game {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i= 1; i<=n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int h = 0;
			int aa = 0;
			for(int j =1;;j++){
	
				if(j % 2==0){
					if ((h+j)<=b){
						h = h+j; 
					}
					else{
						System.out.println("Aayush");
						break;
					}
				}
				else{
					if((aa+j)<=a){
						aa = aa+j; 
					}
					else{
						System.out.println("Harshit");
						break;
					}
				}
			}
		}
    }
}