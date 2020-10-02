package com.quangnhan.service;

import java.util.List;

import com.quangnhan.model.TrangThaiDonHangModel;

public interface ITrangThaiDonHangService {
	TrangThaiDonHangModel findByMaTrangThai(int maTrangThai);
	List<TrangThaiDonHangModel> findAll();
}
