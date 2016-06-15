package com.bethinking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="_CalculateBlock")
@Entity
public class CalculateBlock {
	
	private int id;
	private String calculateBlockValue;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCalculateBlockValue() {
		return calculateBlockValue;
	}
	public void setCalculateBlockValue(String calculateBlockValue) {
		this.calculateBlockValue = calculateBlockValue;
	}

}
