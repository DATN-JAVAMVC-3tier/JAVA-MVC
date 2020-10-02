package com.quangnhan.dao;

import java.util.List;

import com.quangnhan.model.BaiVietModel;

public interface IBaiVietByTagDAO extends GenericDAO<BaiVietModel>{
	List<BaiVietModel> findBaiVietByTag(String tag);
}
