package com.jpahibernate.project.hibernateAndJpa.business;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpahibernate.project.hibernateAndJpa.dao.ICityDao;
import com.jpahibernate.project.hibernateAndJpa.entities.City;

@Service
public class CityManager implements ICityService {
	private ICityDao icityDao;
	
	@Autowired
	public CityManager(ICityDao icityDao) {
		this.icityDao = icityDao;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		return this.icityDao.getAll();
	}

	@Override
	@Transactional
	public City getOne(int id) {
		return this.icityDao.getOne(id);
	}

	@Override
	@Transactional
	public void add(City city) {
		//busineess
		this.icityDao.add(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		this.icityDao.update(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.icityDao.delete(city);
	}

}
