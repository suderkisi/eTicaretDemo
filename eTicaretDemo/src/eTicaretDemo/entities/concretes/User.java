package eTicaretDemo.entities.concretes;

import eTicaretDemo.entities.abstracts.Entity;

public class User implements Entity {
	public int Id;
	public String name;
	public String lastName;
	public String eposta;
	public String parola;
	
	public User(){
		
	}

	public User(int id, String name, String lastName, String eposta, String parola) {
		super();
		Id = id;
		this.name = name;
		this.lastName = lastName;
		this.eposta = eposta;
		this.parola = parola;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
}

	