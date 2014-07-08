package com.epam.training.jp.jpa.excercises.dao.jpaimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.epam.training.jp.jpa.excercises.dao.AddressDao;
import com.epam.training.jp.jpa.excercises.domain.Address;

public class JpaAddressDao extends GenericJpaDao implements AddressDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void save(Address address) {
		em.persist(address);
	}
}
