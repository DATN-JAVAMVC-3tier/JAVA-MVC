package com.quangnhan.dao.impl;

import java.util.List;

import com.quangnhan.dao.ITableDAO;
import com.quangnhan.mapper.PagingMapper;
import com.quangnhan.paging.Paging;

public class TableDAO extends AbstractDAO<Paging> implements ITableDAO{

	@Override
	public int countRow(String nameTable, String nameColWhere, String value) {
		StringBuilder sql = new StringBuilder();
		List<Paging> listPage;
		if (nameTable != null) {
			sql.append("Select count(*) as countRow from " + nameTable);
			if (nameColWhere != null && value != null) {
				sql.append(" where "+nameColWhere +" = ? ");
				listPage = query(sql.toString(), new PagingMapper(),value);
			}else {
				listPage = query(sql.toString(), new PagingMapper());
			}
			
			//
			return listPage.isEmpty()?0:listPage.get(0).getRowCount();
		}
		
		return 0;
	}


}
