package com.aneesh.springdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aneesh.springdatarest.model.Alien;



@RepositoryRestResource(collectionResourceRel ="aliens",path = "aliens" )
public interface AlienRepo extends JpaRepository<Alien, Integer>
{





}
