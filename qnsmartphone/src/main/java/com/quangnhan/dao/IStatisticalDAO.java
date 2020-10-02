package com.quangnhan.dao;



import java.util.List;

import com.quangnhan.model.StatisticalModel;

public interface IStatisticalDAO extends GenericDAO<StatisticalModel>{
	List<StatisticalModel> findDoanhSoBanRaByMa_TrangThaiOrMa_TrangThaiAndYear(int ma_TrangThai1,int ma_TrangThai2,int year);
	List<StatisticalModel> findDoanhThuByMa_TrangThaiOrMa_TrangThaiAndYear(int ma_TrangThai1,int ma_TrangThai2,int year);
}
