package com.quangnhan.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.quangnhan.model.NhaCungUngModel;

public class NhaCungUngMapper implements RowMapper<NhaCungUngModel>{

	@Override
	public NhaCungUngModel mapRow(ResultSet rs) {
		try {
			NhaCungUngModel nCU = new NhaCungUngModel();
			nCU.setMa_NCU(rs.getInt("ma_NCU"));
			nCU.setTen_NCU(rs.getString("ten_NCU"));
			nCU.setTenCongTy(rs.getString("tenCongTy"));
			return nCU;
		} catch (SQLException e) {
			return null;
		}
	}
	
}
