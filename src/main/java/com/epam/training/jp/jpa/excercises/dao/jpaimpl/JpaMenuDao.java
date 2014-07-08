package com.epam.training.jp.jpa.excercises.dao.jpaimpl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.epam.training.jp.jpa.excercises.dao.MenuDao;
import com.epam.training.jp.jpa.excercises.domain.Food;
import com.epam.training.jp.jpa.excercises.domain.Menu;

public class JpaMenuDao extends GenericJpaDao implements MenuDao {

	@Override
	public List<Menu> getActualMenus() {
		final Date today = new Date();
		final String query = "Select m from Menu m where fromDate < :from and toDate > :to";
		
		return entityManager.createQuery(query).setParameter("from", today)
				.setParameter("to", today).getResultList();
	}

	@Override
	public Food findFoodById(int foodId) {
		return entityManager.find(Food.class, foodId);
	}

}
