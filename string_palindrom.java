import java.util.Scanner;

public class string_palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
        String rev = "" ;
        int temp =0;
        for(int i= st.length()-1; i>=0; i--){
            rev = rev + st.charAt(i);
            System.out.println(st);
            System.out.println(rev);
        }
        if(st.equals(rev)){
            temp =1;
        }
        if(temp==1){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}