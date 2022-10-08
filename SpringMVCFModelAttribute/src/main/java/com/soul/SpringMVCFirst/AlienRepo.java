package com.soul.SpringMVCFirst;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

	//List<Alien> findByAname(String aname);// To retrieve the alience record by name from database by defining user defined method.findByAname: for this just note that we can use ByAaname where By should be capital and Aname(property) where A should be capital nameshould be small. 

//	List<Alien> findByAnameOrderByAidAsc(String aname);// To retrieve the records in ascending order
	
	//List<Alien> findByAnameOrderByAidDesc(String aname); //To retrieve the records in descending order
	
	 
    @Query("from Alien where aname= :name")
	 List<Alien> find(@Param("name") String aname); // fetching data from database using HQL (hibernate query language)
	
}
