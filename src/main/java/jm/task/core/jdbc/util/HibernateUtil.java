package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration cfg = new Configuration();

            cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/project1");
            cfg.setProperty("hibernate.connection.username", "root");
            cfg.setProperty("hibernate.connection.password", "R7m#Q9vL!2xT");
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");

            cfg.setProperty("hibernate.show_sql", "true");
            cfg.setProperty("hibernate.hbm2ddl.auto", "update");

            cfg.addAnnotatedClass(User.class);

            return cfg.buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException("Failed to build session factory", e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}