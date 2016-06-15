package com.bethinking.service;

import java.util.List;

import com.bethinking.model.ExchangeRate;


public interface ExchangeRateService {
	public String findRateById(int id);
	public List<ExchangeRate> findAll();
}
