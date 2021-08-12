package demo.basic.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestPerson {

	public static void main(String[] args) {

		// 1. Create a session factory
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class).buildSessionFactory();

		// 2. Get the session
		Session session = sessionFactory.getCurrentSession();

		try {
			// Create a person
			Person person = new Person("Satish", "Pawar");

			// beginTransaction
			session.beginTransaction();

			session.save(person);

			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
