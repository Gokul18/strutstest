package EmployeeService;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.DTO.EmployeeDTO;

public class EmployeeService {
	//private static final Serializable id = null;
	//public static int add(EmployeeDTO dto) {
	//public static void add(EmployeeDTO dto){
		public void add(EmployeeDTO dto){
		//int pk = 0;
		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			//id=(int) session.save(dto);
			session.save(dto);
			 System.out.println("data add");
			transaction.commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		//return pk;
	}

	public static void update(EmployeeDTO dto) {
		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(dto);
			transaction.commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public static void delete(EmployeeDTO dto) {
		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(dto);
			transaction.commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
	public static void get(int pk) {
		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			EmployeeDTO dto1=(EmployeeDTO) session.get(EmployeeDTO.class,pk);
			System.out.println(dto1.getName());
			System.out.println(dto1.getCity());
			System.out.println(dto1.getState());
			System.out.println(dto1.getId());
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
