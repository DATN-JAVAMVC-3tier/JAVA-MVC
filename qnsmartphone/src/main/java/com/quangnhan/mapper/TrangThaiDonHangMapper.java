package com.quangnhan.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.quangnhan.model.TrangThaiDonHangModel;

public class TrangThaiDonHangMapper implements RowMapper<TrangThaiDonHangModel>{

	@Override
	public TrangThaiDonHangModel mapRow(ResultSet rs) {
		try {
			TrangThaiDonHangModel tTDH = new TrangThaiDonHangModel();
			tTDH.setMa_TrangThai(rs.getInt("ma_trangthai"));
			tTDH.setThongTin_TrangThai(rs.getString("thongtin_trangthai"));
			return tTDH;
		} catch (SQLException e) {
			return null;
		}
	}

}
