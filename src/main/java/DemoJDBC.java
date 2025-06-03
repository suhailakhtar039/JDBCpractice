import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the results
        close
        */
        String url = "jdbc:postgresql://localhost:5432/Student";
        String uname = "postgres";
        String pass = "suhail786";

        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url,uname, pass);

        System.out.println("Connection established");
    }
}
