package repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import Dto.GovntDto;
import entity.GovntEntity;

public class GovntRepoImpl implements GovntRepo1 {
//	ArrayList<GovntEntity> read;

	@Override
	public boolean onsave(GovntEntity entity) {

		

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			try {
				entityTransaction.begin();
				entityManager.persist(entity);
				entityTransaction.commit();
				return true;

			} catch (PersistenceException e) {
				e.printStackTrace();
				if (entityTransaction.isActive()) {
					entityTransaction.rollback();
				}

			} finally {
				entityManager.close();
				entityManagerFactory.close();

			}
			return false;

		}

	
	@Override

	public ArrayList<GovntEntity> read() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("connection is ok");
		ArrayList<GovntEntity> read=null;
		try {
			entityTransaction.begin();
			Query query = entityManager.createNamedQuery("readAll");

			read =  (ArrayList<GovntEntity>) query.getResultList();

			entityTransaction.commit();
		} catch (PersistenceException e) {

			if (entityTransaction.isActive()) {
				entityTransaction.rollback();

			}
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}

		return  read;

	}
}