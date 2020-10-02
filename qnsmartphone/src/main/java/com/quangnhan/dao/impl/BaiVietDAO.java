package com.quangnhan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.mysql.cj.xdevapi.Statement;
import com.quangnhan.dao.IBaiVietDAO;
import com.quangnhan.mapper.BaiVietMapper;
import com.quangnhan.model.BaiVietModel;

public class BaiVietDAO extends AbstractDAO<BaiVietModel> implements IBaiVietDAO {

	@Override
	public List<BaiVietModel> findAll() {

		StringBuilder sql = new StringBuilder("select * from tbl_baiviet");
		return query(sql.toString(), new BaiVietMapper());
	}

	// JDBC có 2 đối tượng chính để thực thi truy vấn SQP repairStament có thể buff
	// tham số vào còn stament thì không thể truyền tham số động vào

	@Override
	public int save(BaiVietModel baiVietModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO tbl_baiviet(tieude,noidung,tag,nguoitao) VALUES(?,?,?,?)");		
		return insert(sql.toString(), baiVietModel.getTieuDe(), baiVietModel.getNoiDung(), baiVietModel.getTag(),
				baiVietModel.getNguoiTao());
	}

	@Override
	public BaiVietModel findOne(int maBaiViet) {
		StringBuilder sql = new StringBuilder("select * from tbl_baiviet where ma_baiviet = ?");
		List<BaiVietModel> baiViet = query(sql.toString(), new BaiVietMapper(), maBaiViet);
		return baiViet.isEmpty() ? null : baiViet.get(0);
	}

	@Override
	public void update(BaiVietModel updateBaiViet) {
		StringBuilder sql = new StringBuilder("UPDATE tbl_baiviet SET ");
		sql.append("tieude = ?,");
		sql.append("noidung = ?,");
		sql.append("tag = ?");
		sql.append("WHERE ma_baiviet = ?");
		 update(sql.toString(), updateBaiViet.getTieuDe(), updateBaiViet.getNoiDung(), updateBaiViet.getTag(),
				 updateBaiViet.getMa_BaiViet());
		
	}

	@Override
	public void delete(int ma_BaiViet) {
		StringBuilder sql = new StringBuilder("DELETE FROM tbl_baiviet WHERE ma_baiviet = ?");
		update(sql.toString(),ma_BaiViet);
		
	}

}
