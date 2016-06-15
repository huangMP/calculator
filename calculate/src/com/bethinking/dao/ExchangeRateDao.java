package com.bethinking.dao;

import java.util.List;

import com.bethinking.model.CalculateBlock;
import com.bethinking.model.CalculateWay;
import com.bethinking.model.ExchangeRate;
import com. bethinking.model.Record;

public interface ExchangeRateDao {
	public List<ExchangeRate> findAll();
	public ExchangeRate findById(int id);
}
