package com.quangnhan.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.quangnhan.dao.impl.ChiTietDonHangDAO;
import com.quangnhan.model.ChiTietDonHangModel;
import com.quangnhan.service.IChiTietDonHangService;

public class ChiTietDonHangService implements IChiTietDonHangService{
	@Inject
	ChiTietDonHangDAO chiTietDonHangDAO;
	@Override
	public int save(ChiTietDonHangModel chiTietDonHang) {
		
		return chiTietDonHangDAO.save(chiTietDonHang);
	}

	@Override
	public ChiTietDonHangModel findByIdChiTietDonHang(int ma_ChiTietDonHang) {
		
		return chiTietDonHangDAO.findByIdChiTietDonHang(ma_ChiTietDonHang);
	}

	@Override
	public List<ChiTietDonHangModel> findByIdDonHang(int ma_DonHang) {
		
		return chiTietDonHangDAO.findByIdDonHang(ma_DonHang);
	}

	@Override
	public void updateSoLuongCon(ChiTietDonHangModel chiTietDonHang) {
		chiTietDonHangDAO.updateSoLuongCon(chiTietDonHang);
	}

}
