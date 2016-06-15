package com.bethinking.dao;

import java.util.List;

import com.bethinking.model.CalculateBlock;
import com.bethinking.model.CalculateWay;
import com. bethinking.model.Record;

public interface CalculateBlockDao {
	public List<CalculateBlock> findById(int id);
}
