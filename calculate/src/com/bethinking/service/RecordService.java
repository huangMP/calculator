package com.bethinking.service;

import java.util.List;

import com. bethinking.model.Record;

public interface RecordService {
	public void save(Record record);
	public List<Record> list( Record record );
	public void delete(Record rrecord);
	public void deleteAll();
	public List<Record> listAll();
	public int findId( Record record );
}
