import java.util.Scanner;
public class CharacterIntConversion {
    public static void main(String[] args) {
        char grade='B';
        Scanner x=new Scanner(System.in);
        grade=(char)(grade+8);
        System.out.println(grade);
        //Decrypting the grade
        grade=(char)(grade-8);
        System.out.println(grade);
        char chr=x.next().charAt(0);
        System.out.println(chr);
    }
}
