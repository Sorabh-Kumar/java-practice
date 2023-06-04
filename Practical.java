/*
import java.sql.*;
import java.util.*;
import java.lang.String;
class Student {
    Scanner q=new Scanner(System.in);
    public void name(){
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.set(i, q.next());
        }
    }
    public void rollno(){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.set(i, q.nextInt());
        }
    }
    public void marks(){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.set(i, q.nextInt());
        }
    }
}
class practical{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/Aryan","student","");
        Statement s=c.createStatement();
        ResultSet rs= s.executeQuery("select * from aryan");
        Student obj= new Student();
        for(int b=0;b<10;b++){
            obj.marks();
            obj.rollno();
        }
        for(int j=0;j<10;j++){
            int k=0;
            obj.name();
            String str=arr[j];
            while(str[j]!=0){
               k++;
            }
            for(int z=0;z<10;z++){
                if(str[k]=='j' || str[k]=='J'){
                    arr[j]=arr.insert(str);
                }
                else{
                    arr.delete(i);
                }
            }
        }
        for(int p=0;p<10;p++){
            System.out.println(arr[p]);
        }
        rs.close();
        s.close();
        c.close();
    }
}*/
