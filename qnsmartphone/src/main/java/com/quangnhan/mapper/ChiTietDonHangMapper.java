package com.quangnhan.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.quangnhan.model.BaiVietModel;
import com.quangnhan.model.ChiTietDonHangModel;

public class ChiTietDonHangMapper implements RowMapper<ChiTietDonHangModel>{

	@Override
	public ChiTietDonHangModel mapRow(ResultSet rs) {
		try {
			ChiTietDonHangModel chiTietDonHang = new ChiTietDonHangModel();
			chiTietDonHang.setMa_ChiTietDonHang(rs.getInt("ma_chitietdonhang"));
			chiTietDonHang.setSoLuong(rs.getInt("soluong"));
			chiTietDonHang.setGiaTien(rs.getDouble("giatien"));
			chiTietDonHang.setNgayBatDau_BaoHanh(rs.getTimestamp("ngaybatdau_baohanh"));
			chiTietDonHang.setNgayKetThuc_BaoHanh(rs.getTimestamp("ngayketthuc_baohanh"));
			chiTietDonHang.setMa_SanPham(rs.getInt("ma_sanpham"));
			chiTietDonHang.setMa_DonHang(rs.getInt("ma_donhang"));
			if (rs.getTimestamp("create_date") != null) {
				chiTietDonHang.setCreate_Date(rs.getTimestamp("create_date"));
			}
			if (rs.getInt("create_by") != 0) {
				chiTietDonHang.setCreate_By(rs.getInt("create_by"));
			}
			if (rs.getTimestamp("update_date") != null) {
				chiTietDonHang.setUpdate_Date(rs.getTimestamp("update_date"));
			}
			if (rs.getInt("update_by") != 0) {
				chiTietDonHang.setUpdate_By(rs.getInt("update_by"));
			}
			
			return chiTietDonHang;
		} catch (SQLException e) {
			return null;
		}
	}

}
