package com.quangnhan.dao;

import java.util.List;

import com.quangnhan.model.BaiVietModel;

public interface IBaiVietDAO extends GenericDAO<BaiVietModel>{
	// default trong interface là public rồi
	List<BaiVietModel> findAll();
	int save(BaiVietModel baiVietModel);
	BaiVietModel findOne(int id);
	void update(BaiVietModel updateBaiViet);
	void delete(int ma_BaiViet);
}
