package com.epam.training.jp.jpa.excercises.dao.jpaimpl;

import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;

import com.epam.training.jp.jpa.excercises.dao.MenuDao;
import com.epam.training.jp.jpa.excercises.domain.Food;
import com.epam.training.jp.jpa.excercises.domain.Menu;

public class JpaMenuDao extends GenericJpaDao implements MenuDao {

	@Override
	public List<Menu> getActualMenus() {
		final Date today = new Date();
		final String findQuery = "select m from Menu m where fromDate >= :from and toDate <= :to";
		
		TypedQuery<Menu> query = entityManager.createQuery(findQuery, Menu.class)
				.setParameter("from", today)
				.setParameter("to", today);
		
		return query.getResultList();
	}

	@Override
	public Food findFoodById(int foodId) {
		return entityManager.find(Food.class, foodId);
	}

}
