package com.quangnhan.service;

import java.util.List;

import com.quangnhan.model.NguoiDungModel;

public interface INguoiDungService {
	NguoiDungModel findByTenDangNhapAndMatKhau(String userName, String password);
	NguoiDungModel save(NguoiDungModel nguoiDungModel);
	int saveReturnInt(NguoiDungModel nguoiDungModel);
	boolean isExistTenDangNhap(String userName);
	NguoiDungModel findById(int ma_NguoiDung);
	void updateNguoiDung(NguoiDungModel nguoiDung);
	List<NguoiDungModel> findByMa_VaiTro(String ma_VaiTro);
}
