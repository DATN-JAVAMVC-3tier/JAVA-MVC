package com.quangnhan.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.model.StatisticalModel;
import com.quangnhan.model.TrangThaiNguoiDungModel;
import com.quangnhan.model.VaiTroNguoiDungModel;

public class StatisticalMapper implements RowMapper<StatisticalModel>{

	@Override
	public StatisticalModel mapRow(ResultSet rs) {
		try {
			StatisticalModel statistical = new StatisticalModel();
			if (rs.getString("month")!= null) {
				statistical.setMonth("Mar "+rs.getString("month"));
			}
			if (rs.getInt("sumsoluongban")!= 0) {
				statistical.setSumSoLuongBan(rs.getInt("sumsoluongban"));
			}
			if (rs.getInt("doanhthu") != 0) {
				statistical.setTongDoanhThu(rs.getInt("doanhthu"));
			}
			return statistical;
		} catch (SQLException e) {
			return null;
		}
	}

}
