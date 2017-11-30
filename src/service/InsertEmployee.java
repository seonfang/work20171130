package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Employee;


public class InsertEmployee {

	
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("jpa_link");
		EntityManager entityManager = emfactory.createEntityManager();
		//开始事物
		entityManager.getTransaction().begin();
		Employee employee = new Employee();
		employee.setDeg("123");
		employee.setEid(012);
		employee.setEname("INSER");
		employee.setSalary(55.55);
		
		entityManager.persist(employee);
		//提交事务
		entityManager.getTransaction().commit();
		entityManager.close();
		emfactory.close();
	}
}
