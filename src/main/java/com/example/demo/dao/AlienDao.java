package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

public interface AlienDao extends JpaRepository<Alien, Integer> {

	List<Alien> findByLang(String string);

}
