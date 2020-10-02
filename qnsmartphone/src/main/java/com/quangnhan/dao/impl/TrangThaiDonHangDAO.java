package com.quangnhan.dao.impl;

import java.util.List;

import com.quangnhan.dao.ITrangThaiDonHangDAO;
import com.quangnhan.mapper.TrangThaiDonHangMapper;
import com.quangnhan.model.TrangThaiDonHangModel;

public class TrangThaiDonHangDAO extends AbstractDAO<TrangThaiDonHangModel> implements ITrangThaiDonHangDAO{

	@Override
	public TrangThaiDonHangModel findByMaTrangThai(int maTrangThai) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tbl_trangthaidonhang where ma_trangthai = ? ;");
		List<TrangThaiDonHangModel> listTT = query(sql.toString(), new TrangThaiDonHangMapper(), maTrangThai);
		return listTT.isEmpty()?null:listTT.get(0);
	}

	@Override
	public List<TrangThaiDonHangModel> findAll() {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tbl_trangthaidonhang");
		return query(sql.toString(), new TrangThaiDonHangMapper());
	}

}
