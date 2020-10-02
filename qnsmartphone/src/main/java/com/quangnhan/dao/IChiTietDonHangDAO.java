package com.quangnhan.dao;

import java.util.List;

import com.quangnhan.model.ChiTietDonHangModel;

public interface IChiTietDonHangDAO extends GenericDAO<ChiTietDonHangModel>{
	int save(ChiTietDonHangModel chiTietDonHang);
	void updateSoLuongCon(ChiTietDonHangModel chiTietDonHang);
	ChiTietDonHangModel findByIdChiTietDonHang(int ma_ChiTietDonHang);
	List<ChiTietDonHangModel> findByIdDonHang(int ma_DonHang);
}
