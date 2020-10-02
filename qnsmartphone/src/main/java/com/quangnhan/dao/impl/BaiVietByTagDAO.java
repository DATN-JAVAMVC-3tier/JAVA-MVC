package com.quangnhan.dao.impl;

import java.util.List;

import com.quangnhan.dao.IBaiVietByTagDAO;
import com.quangnhan.mapper.BaiVietByTagMapper;
import com.quangnhan.model.BaiVietModel;

public class BaiVietByTagDAO extends AbstractDAO<BaiVietModel> implements IBaiVietByTagDAO {

	@Override
	public List<BaiVietModel> findBaiVietByTag(String tag) {
		String sql = "select * from tbl_baiviet where tag like ?";
		return query(sql, new BaiVietByTagMapper(), tag);
	}

}
