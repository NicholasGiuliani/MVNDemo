package com.starter.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.starter.model.Person;

@Repository
@SuppressWarnings("unchecked")
public class PersonRepo {

	private transient final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired(required = true)
	private SessionFactory sessionFactory;
	
	@Transactional
    public void addPerson(Person person) {
		try {
            Session currentSession = sessionFactory.getCurrentSession();
            currentSession.persist(person);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	@Transactional
    public void addPerson(String name) {
		try {
            Session currentSession = sessionFactory.getCurrentSession();
            Person person = new Person();
            person.setName(name);
            currentSession.persist(person);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	@Transactional
	public List<Person> findAllPersons() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Person");
		System.out.println("I AM HERE *****************************************************************");
		return query.list();
	}

}
