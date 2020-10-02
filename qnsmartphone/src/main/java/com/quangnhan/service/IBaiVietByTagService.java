package com.quangnhan.service;

import java.util.List;

import com.quangnhan.model.BaiVietModel;

public interface IBaiVietByTagService {
	List<BaiVietModel> findBaiVietByTag(String tag);
}
