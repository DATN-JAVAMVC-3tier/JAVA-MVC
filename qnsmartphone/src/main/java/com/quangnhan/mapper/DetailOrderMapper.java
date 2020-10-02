package com.quangnhan.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.quangnhan.model.DetailOrderModel;

public class DetailOrderMapper implements RowMapper<DetailOrderModel> {

	@Override
	public DetailOrderModel mapRow(ResultSet rs) {
		try {
			DetailOrderModel detailOrder = new DetailOrderModel();
			detailOrder.setHoVaTen(rs.getString("hoVaTen"));
			detailOrder.setEmail(rs.getString("email"));
			detailOrder.setSoDienThoai(rs.getString("soDienThoai"));
			detailOrder.setDiaChi(rs.getString("diaChi"));
			if (rs.getString("tenDangNhap") != null && rs.getString("matKhau") != null) {
				detailOrder.setTenDangNhap(rs.getString("tenDangNhap"));
				detailOrder.setMatKhau(rs.getString("matKhau"));
			}
			if (rs.getString("ghiChu")!= null) {
				detailOrder.setGhiChu(rs.getString("ghiChu"));
			}
			
			detailOrder.setPhuongThucThanhToan(rs.getString("phuongThucThanhToan"));
			return detailOrder;
		} catch (SQLException e) {
			return null;
		}
	}

}
