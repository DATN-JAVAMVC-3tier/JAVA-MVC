package com.quangnhan.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.quangnhan.model.SanPhamModel;

public class SanPhamAdminMapper implements RowMapper<SanPhamModel>{

	@Override
	public SanPhamModel mapRow(ResultSet rs) {
		SanPhamModel sanPhamModel = new SanPhamModel();
		try {
			sanPhamModel.setMa_SanPham(rs.getInt("ma_sanpham"));
			sanPhamModel.setTen_SanPham(rs.getString("ten_sanpham"));
			sanPhamModel.setLoai_SanPham(rs.getString("loai_sanpham"));
			sanPhamModel.setDiemDanhGia(rs.getDouble("diemdanhgia"));
			try {
				int soLuongBan = rs.getInt("soluongban");
				sanPhamModel.setSoLuongDaBan(soLuongBan); 
			} catch (Exception e) {
				sanPhamModel.setSoLuongDaBan(0); 
			}
			sanPhamModel.setGia_Ban(rs.getDouble("gia_ban"));
			sanPhamModel.setSoLuongNhap(rs.getInt("soluongnhap"));
			sanPhamModel.setSoLuongCon(rs.getInt("soluongcon"));
			sanPhamModel.setTrangThai(rs.getString("trangthai"));
			sanPhamModel.setThuongHieu(rs.getString("thuonghieu"));
			if (rs.getTimestamp("create_date") != null) {
				sanPhamModel.setCreate_Date(rs.getTimestamp("create_date"));
			}
			if (rs.getInt("create_by") != 0) {
				sanPhamModel.setCreate_By(rs.getInt("create_by"));
			}
			if (rs.getTimestamp("update_date") != null) {
				sanPhamModel.setUpdate_Date(rs.getTimestamp("update_date"));
			}
			if (rs.getInt("update_by") != 0) {
				sanPhamModel.setUpdate_By(rs.getInt("update_by"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sanPhamModel;
	}

}
