package com.jpahibernate.project.hibernateAndJpa.business;

import java.util.List;

import com.jpahibernate.project.hibernateAndJpa.entities.City;

public interface ICityService {
	List<City> getAll();
	City getOne(int id);
	void add(City city);
	void update(City city);
	void delete(City city);
}
