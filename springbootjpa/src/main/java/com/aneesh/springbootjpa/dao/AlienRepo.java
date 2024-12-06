package com.aneesh.springbootjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aneesh.springbootjpa.model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>
{
    // List<Alien> findByTech(String tech);
    // List<Alien> findByAidGreaterThan(int aid);
    // // JPQL is called this query language . java persistence querly language
    // @Query("from Alien where tech = ?1 order by aname")
    // List<Alien> findByTechSorted(String tech);



}
