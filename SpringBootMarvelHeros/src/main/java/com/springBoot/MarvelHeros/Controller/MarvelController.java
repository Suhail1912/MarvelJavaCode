package com.springBoot.MarvelHeros.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.MarvelHeros.Model.MarvelModel;
import com.springBoot.MarvelHeros.Service.MarvelService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/marvel")
public class MarvelController {
	
	@Autowired
	MarvelService marvelService;
	
	@GetMapping()
	public List<MarvelModel> getMarvelHerosInfo()
	{
		return marvelService.getMarvelHerosInfo();
	}
	
	@GetMapping("/topHeros")
	public List<MarvelModel> getTopMarvelHeros()
	{
		
		return marvelService.getTopHeros();
	}
	
	@GetMapping("/{id}")
	public Optional<MarvelModel> getHeroDetails(@PathVariable(value="id") String marvelId)
	{
		int id=Integer.parseInt(marvelId);
		return marvelService.getHeroDetailsById(id);
	}
	
}
