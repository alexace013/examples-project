package examples.hibernate;

import examples.hibernate.user.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.generator.NameGenerator;
import utils.hibernate.HibernateUtil;

public class HibernateDemo {

    private static NameGenerator nameGenerator = new NameGenerator();

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = new User();
        user.setIdCode(user.hashCode());
        user.setIdPassport("TEST_PASS_ID");
        user.setFirstName(nameGenerator.generateFirstName());
        user.setLastName(nameGenerator.generateLastName());
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

}
