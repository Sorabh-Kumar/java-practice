/*
import java.util.Scanner;
public class practice{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=x.next();
        int c=0;
        if(str.length()%2!=0){
            for (int i=0;i<str.length()/2;i++){
                for (int j=(str.length()-1);j>=(str.length()/2);j--) {
                    if (str.charAt(i) == str.charAt(j)) {
                        c++;
                    }
                }
            }
        }
        else{
            for (int i=0;i<(str.length()/2);i++){
                for (int j=(str.length()-1);j>((str.length()/2));j--){
                    if (str.charAt(i) == str.charAt(j)){
                        c++;
                    }
                }
            }
        }
            if(c==(str.length()/2))
                System.out.print("Palindrome");
            else System.out.print("Not Palindrome");
    }
}*/
import java.util.*;      // * imports all file inside util
public class practice{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
    }
}