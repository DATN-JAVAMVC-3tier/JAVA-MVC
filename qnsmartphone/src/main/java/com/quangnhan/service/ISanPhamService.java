package com.quangnhan.service;

import java.util.List;

import com.quangnhan.model.SanPhamModel;

public interface ISanPhamService {
	List<SanPhamModel> findAll();
	List<SanPhamModel> findAllByStatusIsActive();
	List<SanPhamModel> findByLoaiSanPham(String loai_SanPham);
	List<SanPhamModel> findByThuongHieu(String thuongHieu);
	List<SanPhamModel> findByTag(String tag);
	List<SanPhamModel> findAllAndLimit(int start,int select);
	List<SanPhamModel> findAllByThuongHieuAndLimit(String thuongHieu,int start,int select);
	List<SanPhamModel> findByTrangThai(String trangthai);
	SanPhamModel findById(int ma_SanPham);
	int save(SanPhamModel sanPhamModel);
	List<SanPhamModel> findAllByTenSanPham(String tenSanPham);
	List<SanPhamModel> findAllByAdmin();
	void deleteByMaSanPham(int ma_SanPham);
	int update(SanPhamModel sanPhamModel);
	int updateTrangThai(String trangThai,int ma_SanPham);
	List<SanPhamModel> findAllByGiaAndOrderBy(int tu, int den, String orderby);
	void updateSoluong(int ma_SanPham,int soLuong);
}
