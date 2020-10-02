package com.quangnhan.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.quangnhan.dao.impl.TrangThaiDonHangDAO;
import com.quangnhan.model.TrangThaiDonHangModel;
import com.quangnhan.service.ITrangThaiDonHangService;

public class TrangThaiDonHangService implements ITrangThaiDonHangService{
@Inject
TrangThaiDonHangDAO ttDAO;
	@Override
	public TrangThaiDonHangModel findByMaTrangThai(int maTrangThai) {
		
		return ttDAO.findByMaTrangThai(maTrangThai);
	}

	@Override
	public List<TrangThaiDonHangModel> findAll() {

		return ttDAO.findAll();
	}

}
