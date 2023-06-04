import java.sql.*;
public class jdbc_example {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/First","root","");
        Statement s=c.createStatement();
        ResultSet rs= s.executeQuery("select * from aryan");
        while(rs.next()){
            System.out.println(rs.getString("name")+"  "+rs.getInt(2));
        }
        rs.close();
        s.close();
        c.close();
    }
}
