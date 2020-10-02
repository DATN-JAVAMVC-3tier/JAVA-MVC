package com.quangnhan.mapper;

import java.sql.ResultSet;

import com.quangnhan.model.DonHangModel;
import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.model.TrangThaiNguoiDungModel;
import com.quangnhan.model.VaiTroNguoiDungModel;

public class DonHangMapper implements RowMapper<DonHangModel> {

	@Override
	public DonHangModel mapRow(ResultSet rs) {
		try {
			DonHangModel donHang = new DonHangModel();
			donHang.setMa_DonHang(rs.getInt("ma_donhang"));
			donHang.setPhuongThucThanhToan(rs.getString("phuongthucthanhtoan"));
			donHang.setPhuongThucMua(rs.getString("phuongthucmua"));
			donHang.setTongTien(rs.getDouble("tongtien"));
			donHang.setThoiGianLap(rs.getTimestamp("thoigianlap"));
			donHang.setGhiChu(rs.getString("ghichu"));
			donHang.setTenNguoiNhan(rs.getString("tennguoinhan"));
			donHang.setDiaChi(rs.getString("diachi"));
			donHang.setEmail(rs.getString("email"));
			donHang.setSoDienThoai(rs.getString("sodienthoai"));
			donHang.setTinhTrang_DonHang(rs.getString("tinhtrang_donhang"));
			if (rs.getInt("ma_khachhang") != 0) {
				donHang.setMa_KhachHang(rs.getInt("ma_khachhang"));
			}
				donHang.setMa_TrangThai(rs.getInt("ma_trangthai"));
			if (rs.getInt("ma_khuyenmai") != 0) {
				donHang.setMa_KhuyenMai(rs.getInt("ma_khuyenmai"));
			}
			if (rs.getInt("ma_shiper") != 0) {
				donHang.setMa_Shipper(rs.getInt("ma_shiper"));
			}
			if (rs.getInt("ma_nhanvien") != 0) {
				donHang.setMa_NhanVien(rs.getInt("ma_nhanvien"));
			}
			if (rs.getTimestamp("create_date") != null) {
				donHang.setCreate_Date(rs.getTimestamp("create_date"));
			}
			if (rs.getInt("create_by") != 0) {
				donHang.setCreate_By(rs.getInt("create_by"));
			}
			if (rs.getTimestamp("update_date") != null) {
				donHang.setUpdate_Date(rs.getTimestamp("update_date"));
			}
			if (rs.getInt("update_by") != 0) {
				donHang.setUpdate_By(rs.getInt("update_by"));
			}
			return donHang;
		} catch (Exception e) {
			return null;
		}

	}
}
