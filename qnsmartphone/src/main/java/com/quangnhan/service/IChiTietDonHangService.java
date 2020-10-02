package com.quangnhan.service;

import java.util.List;

import com.quangnhan.model.ChiTietDonHangModel;

public interface IChiTietDonHangService {
	int save(ChiTietDonHangModel chiTietDonHang);
	void updateSoLuongCon(ChiTietDonHangModel chiTietDonHang);
	ChiTietDonHangModel findByIdChiTietDonHang(int ma_ChiTietDonHang);
	List<ChiTietDonHangModel> findByIdDonHang(int ma_DonHang);
	
}
