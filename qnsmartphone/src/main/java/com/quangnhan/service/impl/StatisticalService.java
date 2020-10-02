package com.quangnhan.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.quangnhan.dao.impl.StatisticalDAO;
import com.quangnhan.model.StatisticalModel;
import com.quangnhan.service.IStatisticalService;

public class StatisticalService implements IStatisticalService{

	@Inject
	StatisticalDAO statisticalDAO;
	@Override
	public StatisticalModel findDoanhSoBanRaByMa_TrangThaiOrMa_TrangThaiAndYear(int ma_TrangThai1, int ma_TrangThai2,
			int year) {
		try {
			List<StatisticalModel> listStatisticals = new ArrayList<>();
			listStatisticals=  statisticalDAO.findDoanhSoBanRaByMa_TrangThaiOrMa_TrangThaiAndYear(ma_TrangThai1, ma_TrangThai2, year);
			String[] month = new String[listStatisticals.size()];
			double[] sumSoLuong = new double[listStatisticals.size()];
			
			int i = 0;
			for (StatisticalModel item : listStatisticals) {
				month[i] = item.getMonth();
				sumSoLuong[i]= item.getSumSoLuongBan();
				i++;
			}
			StatisticalModel statistical = new StatisticalModel();
			statistical.setLabels(month);
			statistical.setDatasets(sumSoLuong);
			return statistical;
		} catch (Exception e) {
			return null;
		}
		
	}
	@Override
	public StatisticalModel findDoanhThuByMa_TrangThaiOrMa_TrangThaiAndYear(int ma_TrangThai1, int ma_TrangThai2,
			int year) {
		try {
			List<StatisticalModel> listStatisticals = new ArrayList<>();
			listStatisticals=  statisticalDAO.findDoanhThuByMa_TrangThaiOrMa_TrangThaiAndYear(ma_TrangThai1, ma_TrangThai2, year);
			String[] month = new String[listStatisticals.size()];
			double[] doanhThu = new double[listStatisticals.size()];
			
			int i = 0;
			for (StatisticalModel item : listStatisticals) {
				month[i] = item.getMonth();
				doanhThu[i]= item.getTongDoanhThu();
				i++;
			}
			StatisticalModel statistical = new StatisticalModel();
			statistical.setLabels(month);
			statistical.setDatasets(doanhThu);
			return statistical;
		} catch (Exception e) {
			return null;
		}
	}

}
