package com.quangnhan.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.quangnhan.model.SanPhamModel;

public class SanPhamMapper implements RowMapper<SanPhamModel> {

	@Override
	public SanPhamModel mapRow(ResultSet rs) {
		SanPhamModel sanPhamModel = new SanPhamModel();
		try {
			sanPhamModel.setMa_SanPham(rs.getInt("ma_sanpham"));
			sanPhamModel.setTen_SanPham(rs.getString("ten_sanpham"));
			sanPhamModel.setLoai_SanPham(rs.getString("loai_sanpham"));
			sanPhamModel.setTag(rs.getString("tag"));
			sanPhamModel.setDiemDanhGia(rs.getDouble("diemdanhgia"));
			sanPhamModel.setImages(rs.getString("images"));
			sanPhamModel.setMauSac(rs.getString("mausac"));
			sanPhamModel.setHeDieuHanh(rs.getString("hedieuhanh"));
			sanPhamModel.setPhienBan(rs.getString("phienban"));
			sanPhamModel.setKichThuoc_ManHinh(rs.getString("kichthuoc_manhinh"));
			sanPhamModel.setLoai_ManHinh(rs.getString("loai_manhinh"));
			sanPhamModel.setCamera_Truoc(rs.getString("camera_truoc"));
			sanPhamModel.setCamera_Sau(rs.getString("camera_sau"));
			sanPhamModel.setKetNoi(rs.getString("ketnoi"));
			sanPhamModel.setSim(rs.getString("sim"));
			sanPhamModel.setWifi(rs.getString("wifi"));
			sanPhamModel.setGps(rs.getString("gps"));
			sanPhamModel.setBluetooth(rs.getString("bluetooth"));
			sanPhamModel.setCong_KetNoi(rs.getString("cong_ketnoi"));
			sanPhamModel.setLoai_Pin(rs.getString("loai_pin"));
			sanPhamModel.setBaoMat(rs.getString("baomat"));
			sanPhamModel.setRam(rs.getString("ram"));
			sanPhamModel.setBoNhoTrong(rs.getString("bonhotrong"));
			sanPhamModel.setThongTinThem(rs.getString("thongtinthem"));
			sanPhamModel.setGia_Ban(rs.getDouble("gia_ban"));
			sanPhamModel.setSoLuongNhap(rs.getInt("soluongnhap"));
			sanPhamModel.setSoLuongCon(rs.getInt("soluongcon"));
			sanPhamModel.setGiamGia(rs.getInt("giamgia"));
			sanPhamModel.setMoTa_SanPham(rs.getString("mota_sanpham"));
			sanPhamModel.setThuongHieu(rs.getString("thuonghieu"));
			sanPhamModel.setTrangThai(rs.getString("trangthai"));
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
