package com.quangnhan.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.quangnhan.model.BaiVietModel;
import com.quangnhan.paging.Paging;

public class PagingMapper implements RowMapper<Paging> {

	@Override
	public Paging mapRow(ResultSet rs) {
		try {
			Paging page = new Paging();
			page.setRowCount(rs.getInt("countRow"));
			return page;
		} catch (SQLException e) {
			return null;
		}
	}

}
