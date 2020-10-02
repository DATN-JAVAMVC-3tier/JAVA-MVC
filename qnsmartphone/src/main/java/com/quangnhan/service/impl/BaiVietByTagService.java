package com.quangnhan.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.quangnhan.dao.IBaiVietByTagDAO;
import com.quangnhan.model.BaiVietModel;
import com.quangnhan.service.IBaiVietByTagService;

public class BaiVietByTagService implements IBaiVietByTagService{
	@Inject
	private IBaiVietByTagDAO baiVietByTagDAO;
	@Override
	public List<BaiVietModel> findBaiVietByTag(String tag) {
		// TODO Auto-generated method stub
		return baiVietByTagDAO.findBaiVietByTag(tag);
	}

}
