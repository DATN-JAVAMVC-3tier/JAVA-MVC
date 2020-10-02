package com.quangnhan.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.quangnhan.dao.impl.SanPhamDAO;
import com.quangnhan.model.SanPhamModel;
import com.quangnhan.service.ISanPhamService;

public class SanPhamService implements ISanPhamService {
	@Inject
	private SanPhamDAO sanPhamDAO;

	@Override
	public List<SanPhamModel> findAll() {
		return sanPhamDAO.findAll();
	}

	@Override
	public List<SanPhamModel> findByLoaiSanPham(String loai_SanPham) {
		return sanPhamDAO.findByLoaiSanPham(loai_SanPham);
	}

	@Override
	public List<SanPhamModel> findByTag(String tag) {
		return sanPhamDAO.findByTag(tag);
	}

	@Override
	public List<SanPhamModel> findAllAndLimit(int start, int select) {
		return sanPhamDAO.findAllAndLimit(start, select);
	}

	@Override
	public List<SanPhamModel> findByTrangThai(String trangthai) {
		return sanPhamDAO.findByTrangThai(trangthai);
	}

	@Override
	public SanPhamModel findById(int ma_SanPham) {
		return sanPhamDAO.findById(ma_SanPham);
	}

	@Override
	public int save(SanPhamModel sanPhamModel) {
		if (sanPhamModel.getTrangThai() == null) {
			sanPhamModel.setTrangThai("active");
		}
		sanPhamModel.setDiemDanhGia(5);
		return sanPhamDAO.save(sanPhamModel);
	}

	@Override
	public List<SanPhamModel> findAllByStatusIsActive() {
		return sanPhamDAO.findAllByStatusIsActive();
	}

	@Override
	public List<SanPhamModel> findByThuongHieu(String thuongHieu) {
		return sanPhamDAO.findByThuongHieu(thuongHieu);
	}

	@Override
	public List<SanPhamModel> findAllByThuongHieuAndLimit(String thuongHieu,int start, int select) {
		return sanPhamDAO.findAllByThuongHieuAndLimit(thuongHieu, start, select);
	}

	@Override
	public List<SanPhamModel> findAllByTenSanPham(String tenSanPham) {
		return sanPhamDAO.findAllByTenSanPham(tenSanPham);
	}

	@Override
	public List<SanPhamModel> findAllByAdmin() {
		return sanPhamDAO.findAllByAdmin();
	}

	@Override
	public void deleteByMaSanPham(int ma_SanPham) {
		sanPhamDAO.deleteByMaSanPham(ma_SanPham);
		
	}

	@Override
	public int update(SanPhamModel sanPhamModel) {
		return sanPhamDAO.update(sanPhamModel);
	}

	@Override
	public int updateTrangThai(String trangThai, int ma_SanPham) {		
		return sanPhamDAO.updateTrangThai(trangThai, ma_SanPham);
	}

	@Override
	public List<SanPhamModel> findAllByGiaAndOrderBy(int tu, int den, String orderby) {
		return sanPhamDAO.findAllByGiaAndOrderBy(tu, den, orderby);
	}

	@Override
	public void updateSoluong(int ma_SanPham, int soLuong) {
		sanPhamDAO.updateSoluong(ma_SanPham, soLuong);
		
	}

}
