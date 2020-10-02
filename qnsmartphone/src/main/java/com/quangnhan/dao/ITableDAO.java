package com.quangnhan.dao;

import com.quangnhan.paging.Paging;

public interface ITableDAO extends GenericDAO<Paging>{
	int countRow(String nameTable, String nameColWhere,String value);
}
