package com.bethinking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="_interestrate")
@Entity
public class InterestRate {
	private int id;
	private String interestRateItem;
	private String interestRateItemSpell;
	private String interestRate;
	private String latestYear;
	private String depositTimeToYear;
	
	@Id
	@GeneratedValue
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="interest_rate_item")
	public String getInterestRateItem() {
		return interestRateItem;
	}
	public void setInterestRateItem(String interestRateItem) {
		this.interestRateItem = interestRateItem;
	}
	
	@Column(name="interest_rate_item_spell")
	public String getInterestRateItemSpell() {
		return interestRateItemSpell;
	}
	public void setInterestRateItemSpell(String interestRateItemSpell) {
		this.interestRateItemSpell = interestRateItemSpell;
	}
	
	@Column(name="interest_rate")
	public String getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	
	@Column(name="latest_year")
	public String getLatestYear() {
		return latestYear;
	}
	public void setLatestYear(String latestYear) {
		this.latestYear = latestYear;
	}
	
	@Column(name="deposit_time_to_year")
	public String getDepositTimeToYear() {
		return depositTimeToYear;
	}
	public void setDepositTimeToYear(String depositTimeToYear) {
		this.depositTimeToYear = depositTimeToYear;
	}
	
	
	
	
	
}
