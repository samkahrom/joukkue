package com.example.joukkue.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Joukkue {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long Id;

	public String Title;
	public String Nimi;
	public int Taito;
	public String Maara;
	public double Price;

	public Joukkue(Long id, String title, String nimi, int taito, String maara, double price) {
		super();
		Id = id;
		Title = title;
		Nimi = nimi;
		Taito = taito;
		Maara = maara;
		Price = price;
	}

	public Joukkue() {

	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getNimi() {
		return Nimi;
	}

	public void setNimi(String nimi) {
		Nimi = nimi;
	}

	public int getTaito() {
		return Taito;
	}

	public void setTaito(int taito) {
		Taito = taito;
	}

	public String getMaara() {
		return Maara;
	}

	public void setMaara(String maara) {
		Maara = maara;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

}
