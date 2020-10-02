package com.quangnhan.dao;

import java.util.List;

import com.quangnhan.model.NguoiDungModel;

public interface INguoiDungDAO extends GenericDAO<NguoiDungModel>{
		NguoiDungModel findByTenDangNhapAndMatKhau(String userName,String password);
		NguoiDungModel findById(int ma_NguoiDung);
		int save(NguoiDungModel nguoiDungModel);
		boolean isExistTenDangNhap(String userName);
		void updateNguoiDung(NguoiDungModel nguoiDung);
		List<NguoiDungModel> findByMa_VaiTro(String ma_VaiTro);
}
