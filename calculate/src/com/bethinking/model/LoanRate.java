package com.bethinking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="_loan_rate")
@Entity
public class LoanRate {
	private int id;
	private String loanRate;
	private int loanTimeForMonth;
	private int loanType;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoanRate() {
		return loanRate;
	}
	public void setLoanRate(String loanRate) {
		this.loanRate = loanRate;
	}
	public int getLoanTimeForMonth() {
		return loanTimeForMonth;
	}
	public void setLoanTimeForMonth(int loanTimeForMonth) {
		this.loanTimeForMonth = loanTimeForMonth;
	}
	public int getLoanType() {
		return loanType;
	}
	public void setLoanType(int loanType) {
		this.loanType = loanType;
	}

}
