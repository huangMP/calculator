package com.bethinking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name="_Record")
@Entity
public class Record {
	private String numF;
	private String numI;
	private String numN;
	private String numP;
	private int id;
	private int calculateWay;
	private int calculateBlock;
	private String calculateWayValue;
	private String calculateBlockValue;

	public Record() {}


	public Record(String numP, String numI, String numN, String numF,
			int calculateWay, int calculateBlock) {
		this.numF = numF;
		this.numI = numI;
		this.numN = numN;
		this.numP = numP;
		this.calculateWay = calculateWay;
		this.calculateBlock = calculateBlock;
	}
	public void putAll(){
		System.out.println("numP"+numP);
		System.out.println("numI"+numI);
		System.out.println("numN"+numN);
		System.out.println("numF"+numF);
		System.out.println("calculateWay"+calculateWay);
		System.out.println("calculateBlock"+calculateBlock);
	}
	
	
	public String getNumF() {
		return numF;
	}
	public void setNumF(String numF) {
		this.numF = numF;
	}
	public String getNumI() {
		return numI;
	}
	public void setNumI(String numI) {
		this.numI = numI;
	}
	public String getNumN() {
		return numN;
	}
	public void setNumN(String numN) {
		this.numN = numN;
	}
	public String getNumP() {
		return numP;
	}
	public void setNumP(String numP) {
		this.numP = numP;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCalculateWay() {
		return calculateWay;
	}
	public int getCalculateBlock() {
		return calculateBlock;
	}
	public void setCalculateBlock(int calculateBlock) {
		this.calculateBlock = calculateBlock;
	}
	public void setCalculateWay(int calculateWay) {
		this.calculateWay = calculateWay;
	}
	@Transient
	public String getCalculateBlockValue() {
		return calculateBlockValue;
	}
	public void setCalculateBlockValue(String calculateBlockValue) {
		this.calculateBlockValue = calculateBlockValue;
	}
	@Transient
	public String getCalculateWayValue() {
		return calculateWayValue;
	}
	public void setCalculateWayValue(String calculateWayValue) {
		this.calculateWayValue = calculateWayValue;
	}
}
