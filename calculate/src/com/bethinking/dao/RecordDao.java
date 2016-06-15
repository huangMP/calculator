package com.bethinking.dao;

import java.util.List;

import com. bethinking.model.Record;

public interface RecordDao {
	public void add( Record r);
	public List<Record> list( Record r );
	public void delete(Record r);
	public void deleteAll();
	public List<Record> listAll();
	public int findId( Record r );
}
