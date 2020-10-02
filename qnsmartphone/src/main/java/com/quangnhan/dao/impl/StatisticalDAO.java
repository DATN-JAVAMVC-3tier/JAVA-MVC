package com.quangnhan.dao.impl;

import java.util.List;

import com.quangnhan.dao.IStatisticalDAO;
import com.quangnhan.mapper.StatisticalMapper;
import com.quangnhan.model.StatisticalModel;

public class StatisticalDAO extends AbstractDAO<StatisticalModel> implements IStatisticalDAO{

	@Override
	public List<StatisticalModel> findDoanhSoBanRaByMa_TrangThaiOrMa_TrangThaiAndYear(int ma_TrangThai1, int ma_TrangThai2,
			int year) {
		StringBuilder sql = new StringBuilder();
		sql.append("select sum(soluong)  as 'sumsoluongban',month(dh.create_date) as 'month',0 as'doanhthu' from tbl_chitietdonhang ctdh inner join tbl_donhang dh on ctdh.ma_donhang = dh.ma_donhang");
		sql.append(" where (dh.ma_trangthai = ? or dh.ma_trangthai = ?) and year(dh.create_date) = ? group by  month(dh.create_date) order by month(dh.create_date) asc;");
		return query(sql.toString(), new StatisticalMapper(), ma_TrangThai1,ma_TrangThai2,year);
	}

	@Override
	public List<StatisticalModel> findDoanhThuByMa_TrangThaiOrMa_TrangThaiAndYear(int ma_TrangThai1, int ma_TrangThai2,
			int year) {
		StringBuilder sql = new StringBuilder();
		sql.append("select sum(soluong*giatien)  as 'doanhthu',month(dh.create_date) as 'month', 0 as 'sumsoluongban' from tbl_chitietdonhang ctdh inner join tbl_donhang dh on ctdh.ma_donhang = dh.ma_donhang");
		sql.append(" where (dh.ma_trangthai = ? or dh.ma_trangthai = ?) and year(dh.create_date) = ? group by  month(dh.create_date) order by month(dh.create_date) asc;");
		return query(sql.toString(), new StatisticalMapper(), ma_TrangThai1,ma_TrangThai2,year);
	}

}
