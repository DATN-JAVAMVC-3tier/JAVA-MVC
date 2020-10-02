package com.quangnhan.service;

import java.util.List;

import com.quangnhan.model.StatisticalModel;

public interface IStatisticalService {
	StatisticalModel findDoanhSoBanRaByMa_TrangThaiOrMa_TrangThaiAndYear(int ma_TrangThai1,int ma_TrangThai2,int year);
	StatisticalModel findDoanhThuByMa_TrangThaiOrMa_TrangThaiAndYear(int ma_TrangThai1,int ma_TrangThai2,int year);
}
