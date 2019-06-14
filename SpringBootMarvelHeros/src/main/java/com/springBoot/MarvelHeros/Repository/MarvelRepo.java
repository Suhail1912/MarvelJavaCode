package com.springBoot.MarvelHeros.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springBoot.MarvelHeros.Model.MarvelModel;

@Repository
public interface MarvelRepo extends JpaRepository<MarvelModel, Integer> {

	@Query(value ="select * from marvel_information", nativeQuery = true)
	List<MarvelModel> getTopHeros(org.springframework.data.domain.Pageable pageable1);
}
