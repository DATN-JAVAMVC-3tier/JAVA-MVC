package com.quangnhan.dao;

import java.util.List;

import com.quangnhan.model.DonHangModel;

public interface IDonHangDAO extends GenericDAO<DonHangModel>{
	int saveDonHang(DonHangModel donHang);
	DonHangModel findByMaHang(int ma_DonHang);
	List<DonHangModel> findBySoDienThoai(int soDienThoai);
	List<DonHangModel> findByParameter(Object... parameters);
	List<DonHangModel> findByMa_NguoiDung(int ma_NguoiDung);
	List<DonHangModel> findDonHangByTrangThai(int trangThai1,int trangThai2,int trangThai3,int trangThai4);
	void updateMa_Shipper(int ma_Shipper,int ma_DonHang);
	void updateMa_TrangThai(int ma_TrangThai,int ma_DonHang);
	List<DonHangModel> findByMa_ShipperAndTrangThai(int ma_Shipper,int trangThai1,int trangThai2,int trangThai3,int trangThai4);
	DonHangModel findByMa_DonHangAndMa_Shipper(int ma_DonHang,int ma_Shipper);
	void updateTinhTrangAndTrangThai(int ma_DonHang,String tinhtrangselect,String tinhtranginput);
	
}
