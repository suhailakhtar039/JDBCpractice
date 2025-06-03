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
        String sql = "select sname from student where sid = 3";

        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url,uname, pass);

        System.out.println("Connection established");

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        System.out.println(rs.next());
        conn.close();
        System.out.println("Connection closed");

    }
}
