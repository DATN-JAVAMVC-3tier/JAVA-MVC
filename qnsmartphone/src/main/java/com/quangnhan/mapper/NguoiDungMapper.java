package com.quangnhan.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.model.TrangThaiNguoiDungModel;
import com.quangnhan.model.VaiTroNguoiDungModel;

public class NguoiDungMapper implements RowMapper<NguoiDungModel>{

	@Override
	public NguoiDungModel mapRow(ResultSet rs) {
		try {
			NguoiDungModel nguoiDung = new NguoiDungModel();
			nguoiDung.setMa_NguoiDung(rs.getInt("ma_nguoidung"));
			nguoiDung.setTenDangNhap(rs.getString("tendangnhap"));
			nguoiDung.setMatKhau(rs.getString("matkhau"));
			nguoiDung.setHoVaTen(rs.getString("hovaten"));
			nguoiDung.setEmail(rs.getString("email"));
			nguoiDung.setSoDienThoai(rs.getString("sodienthoai"));
			nguoiDung.setDiaChi(rs.getString("diachi"));
			nguoiDung.setSoDu(rs.getDouble("sodu"));
			nguoiDung.setImage(rs.getString("image"));
			nguoiDung.setMa_TrangThai(rs.getString("ma_trangthai"));
			nguoiDung.setMa_VaiTro(rs.getString("ma_vaitro"));
			try {
				TrangThaiNguoiDungModel trangThai = new TrangThaiNguoiDungModel();
				trangThai.setMa_TrangThai(rs.getString("ma_trangthai"));
				trangThai.setThongTin_TrangThai("thongtin_trangthai");
				VaiTroNguoiDungModel vaiTro = new VaiTroNguoiDungModel();
				vaiTro.setMa_VaiTro(rs.getString("ma_vaitro"));
				vaiTro.setThongTin_VaiTro("thongtin_vaitro");
				nguoiDung.setTrangThaiNguoiDung(trangThai);
				nguoiDung.setVaiTroNguoiDung(vaiTro);
			} catch (Exception e) {
				// lưu log
				System.out.println(e.toString());
			}
			
			if (rs.getString("socmnd") != null) {
				nguoiDung.setSoCMND(rs.getString("socmnd"));
			}
			if (rs.getString("anhcmnd") != null) {
				nguoiDung.setAnhCMND(rs.getString("anhcmnd"));
			}
			if (rs.getString("tenchuthe") != null) {
				nguoiDung.setTenChuThe(rs.getString("tenchuthe"));
			}
			if (rs.getString("sothe") != null) {
				nguoiDung.setSoThe(rs.getString("sothe"));
			}
			if (rs.getString("ngayhethan") != null) {
				nguoiDung.setNgayHetHan(rs.getString("ngayhethan"));
			}
			if (rs.getString("ma_cvc") != null) {
				nguoiDung.setMa_CVC(rs.getString("ma_cvc"));
			}
			return nguoiDung;
		} catch (SQLException e) {
			return null;
		}
	}

}
