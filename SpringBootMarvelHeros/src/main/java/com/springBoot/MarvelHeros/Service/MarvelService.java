package com.springBoot.MarvelHeros.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springBoot.MarvelHeros.Model.MarvelModel;
import com.springBoot.MarvelHeros.Repository.MarvelRepo;

@Service
public class MarvelService {

	@Autowired
	MarvelRepo marvelRepo;
	
	public List<MarvelModel> getMarvelHerosInfo() {
		// TODO Auto-generated method stub
		List<MarvelModel> ls=marvelRepo.findAll();
		return ls;
		
	}

	public List<MarvelModel> getTopHeros() {
		// TODO Auto-generated method stub
		Pageable pageable1=PageRequest.of(0,4,Sort.Direction.ASC,"id");
		return marvelRepo.getTopHeros(pageable1);
	}

	public Optional<MarvelModel> getHeroDetailsById(int id) {
		// TODO Auto-generated method stub
		return marvelRepo.findById(id);
	}

}
