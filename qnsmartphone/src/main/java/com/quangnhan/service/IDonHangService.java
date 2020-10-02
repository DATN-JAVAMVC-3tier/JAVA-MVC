package com.quangnhan.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.quangnhan.model.DetailOrderModel;
import com.quangnhan.model.DonHangModel;
import com.quangnhan.model.ResultMesageModel;
import com.quangnhan.model.SanPhamModel;

public interface IDonHangService {
	ResultMesageModel createOrder(DetailOrderModel detailOrder, List<SanPhamModel> listSanPhamOrder,int ma_KhachHang) ;
	int saveDonHang(DonHangModel donHang);
	DonHangModel findByMaHang(int maDonHang);
	List<DonHangModel> findDetailDonHangByIdOrPhone(String keyWord);
	List<DonHangModel> findDetailDonHangByMa_NguoiDung(int ma_NguoiDung);
	List<DonHangModel> findByTrangThai(int trangThai1,int trangThai2,int trangThai3,int trangThai4);
	void updateMa_Shipper(int ma_Shipper,int ma_DonHang);
	void updateMa_TrangThai(int ma_TrangThai,int ma_DonHang);
	void updateMa_Shipper(HttpServletRequest request);
	List<DonHangModel> findByMa_ShipperAndTrangThai(int ma_Shipper,int trangThai1,int trangThai2,int trangThai3,int trangThai4);
	DonHangModel findByMa_DonHangAndMa_Shipper(int ma_DonHang,int ma_Shipper);
	void updateTinhTrangAndTrangThai(int ma_DonHang,String tinhtrangselect,String tinhtranginput);
}
