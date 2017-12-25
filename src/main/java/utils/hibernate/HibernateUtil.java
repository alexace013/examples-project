package utils.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import utils.logger.Log4JWrapper;

public class HibernateUtil {

    private static final SessionFactory SESSION_FACTORY;
    private static final ServiceRegistry SERVICE_REGISTRY;

    static {
        Configuration conf = new Configuration();
        conf.configure();
        SERVICE_REGISTRY = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        try {
            SESSION_FACTORY = conf.buildSessionFactory(SERVICE_REGISTRY);
        } catch (Exception e) {
            Log4JWrapper.debug("SOMETHING WRONG WITH HibernateUtil.");
            Log4JWrapper.error(e.getMessage());
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }

}
