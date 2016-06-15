package com.bethinking.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com. bethinking.util.Calculator;
import com. bethinking.service.RecordService;
import com. bethinking.model.Record;
import com. bethinking.dao.RecordDao;

@Component("recordService")
public class RecordServiceImpl implements RecordService{
	
	RecordDao recordDao;
	

	public void save(Record record){
		this.recordDao.delete(record);
		this.recordDao.add(record);
	}

	public List<Record> list(Record record) {
		return this.recordDao.list(record);
	}

	public void delete(Record record) {
		this.recordDao.delete(record);
		
	}

	public void deleteAll() {
		this.recordDao.deleteAll();
	}

	public List<Record> listAll() {
		return this.recordDao.listAll();
	}

	public int findId(Record record) {
		return this.recordDao.findId(record);
	}

	public RecordDao getRecordDao() {
		return recordDao;
	}
	
	@Resource
	public void setRecordDao(RecordDao recordDao) {
		this.recordDao = recordDao;
	}
	

	
}
