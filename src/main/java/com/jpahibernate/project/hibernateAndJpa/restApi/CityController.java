package com.jpahibernate.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpahibernate.project.hibernateAndJpa.business.ICityService;
import com.jpahibernate.project.hibernateAndJpa.entities.City;

@RestController
@RequestMapping("/api")
public class CityController {
	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}

	@GetMapping("/getAll")
	public List<City> getAll() {
		return cityService.getAll();
	}

	@GetMapping("/getOne")
	@ResponseBody
	public City getOne(@RequestParam(required = false) int id) {
		return cityService.getOne(id);
	}

	@PostMapping("/add")
	public void add(@RequestBody City city) {
		cityService.add(city);
	}

	@PostMapping("/update")
	public void update(@RequestBody City city) {
		cityService.update(city);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody City city) {
		cityService.delete(city);
	}

}
