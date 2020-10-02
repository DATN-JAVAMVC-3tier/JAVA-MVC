package com.quangnhan.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.quangnhan.model.BaiVietModel;

public class BaiVietMapper implements RowMapper<BaiVietModel> {

	@Override
	public BaiVietModel mapRow(ResultSet rs) {
		
		try {
			BaiVietModel baiViet = new BaiVietModel();
			baiViet.setMa_BaiViet(rs.getInt("ma_baiviet"));
			baiViet.setTieuDe(rs.getString("tieude"));
			baiViet.setNoiDung(rs.getString("noidung"));
			baiViet.setTag(rs.getString("tag"));
			baiViet.setNguoiTao(rs.getInt("nguoitao"));
			
			if (rs.getTimestamp("thoigiantao") != null) {
				baiViet.setThoiGianTao(rs.getTimestamp("thoigiantao"));
			}
			return baiViet;
		} catch (SQLException e) {
			return null;
		}
	}

}
