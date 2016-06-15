package com.bethinking.dao;

import java.util.List;

import com.bethinking.model.CalculateWay;
import com. bethinking.model.Record;

public interface CalculateWayDao {
	public List<CalculateWay> findById(int id);
}
