import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DemoJDBC {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsName("Suhail Akhtar");
        s1.setAge(25);
        s1.setRollNo(1);

        Configuration cfg = new Configuration();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();



    }
}
