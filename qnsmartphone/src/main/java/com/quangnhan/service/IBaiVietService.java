package com.quangnhan.service;

import java.util.List;

import com.quangnhan.model.BaiVietModel;

public interface IBaiVietService {
	List<BaiVietModel> findAll();
	BaiVietModel save(BaiVietModel baiVietModel);
	BaiVietModel update(BaiVietModel updateBaiVietModel);
	void delete(int[] listMa_BaiViet);
}
