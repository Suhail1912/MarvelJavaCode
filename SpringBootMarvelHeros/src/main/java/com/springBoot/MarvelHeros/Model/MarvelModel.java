package com.springBoot.MarvelHeros.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MarvelInformation")
public class MarvelModel {

	@Id
	private int id;
	private String name;
	private String origianlName;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigianlName() {
		return origianlName;
	}
	public void setOrigianlName(String origianlName) {
		this.origianlName = origianlName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
