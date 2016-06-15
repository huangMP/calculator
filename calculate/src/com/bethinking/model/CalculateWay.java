package com.bethinking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="_CalculateWay")
@Entity
public class CalculateWay {
	
	private int id;
	private String calculateWayValue;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCalculateWayValue() {
		return calculateWayValue;
	}
	public void setCalculateWayValue(String calculateWayValue) {
		this.calculateWayValue = calculateWayValue;
	}

}
