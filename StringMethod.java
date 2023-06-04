/*
import java.util.Locale;
public class StringMethod {
    public static void main(String[] args) {
        String name="tewawadfwawatia";
        // int l=name.length();
        //System.out.print(l);
        System.out.println(name.length());    // Returns the length of the string
        String str1="JajJkBk";
        //String lstring=str1.toLowerCase();
        System.out.println(str1.toLowerCase());  // Return the string with all characters in lowercase
        //String ustring=str1.toUpperCase();
        System.out.println(str1.toUpperCase());   // Return the string with all characters in uppercase
        System.out.println(name+str1);            // These methods do not make changes in the original string
        String str2="       My Name Is Aryan Tewatia     ";
        System.out.println(str2.trim());        // Removes all white spaces from starting and end of string
        System.out.println(name.substring(3));  // It will return string from index 3 to last
        System.out.println(name.substring(1,5));  // It will print string from index 1 to 5(including 5 )
        System.out.println(name.replace('e','t'));   //Replaces e with t in the string    ,    Here we use single quotes
        System.out.println(name.replace("twa","zzz"));  // It will replace small part of string with zzz    ,   Here we use double quotes
        System.out.println(name.startsWith("ttw"));
        System.out.println(name.endsWith("tia"));
        System.out.println(name.charAt(3));   // Returns the character at index 3
        System.out.println(name.indexOf('w'));  // Returns the index of a particular character  ,   we can use single and double both quotes
        System.out.println(name.indexOf("wa"));
        System.out.println(name.indexOf("wa",3));  // It will start finding with the index 3
        System.out.println(name.lastIndexOf("wa",4));  // It will start finding with the last
        System.out.println(name.equals("tewatia"));     // Tells if it is equal to the string or not
        System.out.println(name.equalsIgnoreCase("TeWtIa"));   // Tells if it is equal to the string or not with ignoring the upper or lower cases
    }
}
*/
import java.util.Locale;
//import java.util.Scanner;
//class string{
//    public String str1 ,str2;
//    public void string1(){
//        System.out.println(str1 + "University" +str2);
//    }
//}
//public class StringMethod{
//    public static void main(String[] args) {
//        Scanner x=new Scanner(System.in);
//        string obj=new string();
//        obj.str1=x.next();
//        obj.str2=x.next();
//        obj.string1();
//    }
//}

import java.util.Scanner;
class string{
    public String str1 , str2;
    public void String1(){
        System.out.println(str1 + " University " + str2);
    }
}
public class StringMethod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        string obj = new string();
        obj.str1=sc.next();
        obj.str2=sc.next();
        obj.String1();
    }
}