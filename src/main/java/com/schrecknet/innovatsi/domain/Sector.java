package com.schrecknet.innovatsi.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sector implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String sector;
	private Date date;
	private String heat;
	private String humidity;
	
	public Sector() {
		
	}

	public Sector(String id, String sector, Date date, String heat, String humidity) {
		super();
		this.id = id;
		this.sector = sector;
		this.date = date;
		this.heat = heat;
		this.humidity = humidity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHeat() {
		return heat;
	}

	public void setHeat(String heat) {
		this.heat = heat;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
}
