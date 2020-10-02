package com.quangnhan.dao.impl;

import java.util.List;

import com.quangnhan.dao.IChiTietDonHangDAO;
import com.quangnhan.mapper.ChiTietDonHangMapper;
import com.quangnhan.model.ChiTietDonHangModel;

public class ChiTietDonHangDAO extends AbstractDAO<ChiTietDonHangModel> implements IChiTietDonHangDAO{

	@Override
	public int save(ChiTietDonHangModel chiTietDonHang) {
		StringBuilder sql = new StringBuilder();
		sql.append(" insert into tbl_chitietdonhang(soluong,giatien,ma_sanpham,ma_donhang) ");
		sql.append(" values(?,?,?,?); ");
		return insert(sql.toString(),chiTietDonHang.getSoLuong(),chiTietDonHang.getGiaTien(),chiTietDonHang.getMa_SanPham(),chiTietDonHang.getMa_DonHang());
	}

	@Override
	public ChiTietDonHangModel findByIdChiTietDonHang(int ma_ChiTietDonHang) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tbl_chitietdonhang where ma_chitietdonhang = ? ; ");
		List<ChiTietDonHangModel> listChiTietDonHang = query(sql.toString(),new ChiTietDonHangMapper(), ma_ChiTietDonHang);
		return listChiTietDonHang.isEmpty()?null:listChiTietDonHang.get(0);
	}

	@Override
	public List<ChiTietDonHangModel> findByIdDonHang(int ma_DonHang) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tbl_chitietdonhang where ma_donhang = ? ; ");
		return query(sql.toString(),new ChiTietDonHangMapper(), ma_DonHang);
	}

	@Override
	public void updateSoLuongCon(ChiTietDonHangModel chiTietDonHang) {
		StringBuilder sql = new StringBuilder();
		sql.append("update tbl_sanpham set soluongcon = soluongcon - ? where ma_sanpham = ?; ");
		update(sql.toString(), chiTietDonHang.getSoLuong(),chiTietDonHang.getMa_SanPham());
		
	}

}
