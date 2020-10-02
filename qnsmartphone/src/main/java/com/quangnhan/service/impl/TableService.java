package com.quangnhan.service.impl;

import com.quangnhan.dao.impl.TableDAO;
import com.quangnhan.service.ITableService;

public class TableService implements ITableService{

	@Override
	public int countRow(String nameTable, String nameColWhere, String value) {
		return new TableDAO().countRow(nameTable, nameColWhere, value);
	}

}
