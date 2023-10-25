package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="City")
public class City {
	
	@Id
	@Column(name="ID")
	private int ID;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="CountryCode")
	private int CountryCode;
	
	@Column(name="District")
	private String District;
	
	@Column(name="Population")
	private int Population;
	
	//id
	public int getId() {
		return ID;
	}
	public void setId(int ID) {
		this.ID = ID;
	}
	
	//name
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	//country
	public int getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(int CountryCode) {
		this.CountryCode = CountryCode;
	}
	
	//district
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String District) {
		this.District = District;
	}
	
	//population
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int Population) {
		this.Population = Population;
	}
	
}
