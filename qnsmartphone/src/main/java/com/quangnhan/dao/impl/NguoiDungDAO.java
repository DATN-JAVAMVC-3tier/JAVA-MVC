package com.quangnhan.dao.impl;

import java.util.List;

import com.quangnhan.dao.INguoiDungDAO;
import com.quangnhan.mapper.NguoiDungMapper;
import com.quangnhan.model.NguoiDungModel;

public class NguoiDungDAO extends AbstractDAO<NguoiDungModel> implements INguoiDungDAO{

	@Override
	public NguoiDungModel findByTenDangNhapAndMatKhau(String userName, String password) {
		StringBuilder sql = new StringBuilder("select nd.ma_nguoidung,nd.tendangnhap,nd.matkhau,nd.hovaten,nd.email,nd.sodienthoai,nd.diachi,nd.sodu,nd.image,nd.socmnd,nd.anhcmnd,nd.ngaytao,nd.tenchuthe,nd.sothe,nd.ngayhethan,nd.ma_cvc,nd.ma_vaitro,nd.ma_trangthai from tbl_nguoidung nd  ");
		sql.append("inner join tbl_trangthainguoidung tt on nd.ma_trangthai = tt.ma_trangthai ");
		sql.append("inner join tbl_vaitronguoidung vt on nd.ma_vaitro = vt.ma_vaitro ");
		sql.append(" where nd.tendangnhap = ? and nd.matkhau = md5(?)");
		List<NguoiDungModel> listNguoiDung = query(sql.toString(),new NguoiDungMapper(), userName,password);
		return listNguoiDung.isEmpty()?null:listNguoiDung.get(0);

	}
	@Override
	public int save(NguoiDungModel nguoiDungModel) {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into tbl_nguoidung(tendangnhap,matkhau,hovaten,email,sodienthoai,diachi)");
		sql.append("values (?,md5(?),?,?,?,?)");
		return insert(sql.toString(),nguoiDungModel.getTenDangNhap(),nguoiDungModel.getMatKhau(),nguoiDungModel.getHoVaTen(),nguoiDungModel.getEmail(),nguoiDungModel.getSoDienThoai(),nguoiDungModel.getDiaChi());
		
	}

	@Override
	public NguoiDungModel findById(int ma_NguoiDung) {
		StringBuilder sql = new StringBuilder("select nd.ma_nguoidung,nd.tendangnhap,nd.matkhau,nd.hovaten,nd.email,nd.sodienthoai,nd.diachi,nd.sodu,nd.image,nd.socmnd,nd.anhcmnd,nd.ngaytao,nd.tenchuthe,nd.sothe,nd.ngayhethan,nd.ma_cvc,nd.ma_vaitro,nd.ma_trangthai from tbl_nguoidung nd  ");
		sql.append("inner join tbl_trangthainguoidung tt on nd.ma_trangthai = tt.ma_trangthai ");
		sql.append("inner join tbl_vaitronguoidung vt on nd.ma_vaitro = vt.ma_vaitro ");
		sql.append(" where nd.ma_nguoidung = ?");
		List<NguoiDungModel> listNguoiDung = query(sql.toString(),new NguoiDungMapper(),ma_NguoiDung);
		return listNguoiDung.isEmpty()?null:listNguoiDung.get(0);
	}

	@Override
	public boolean isExistTenDangNhap(String userName) {
		StringBuilder sql = new StringBuilder("select tendangnhap from tbl_nguoidung where tendangnhap = ?");
		List<NguoiDungModel> listNguoiDung = query(sql.toString(),new NguoiDungMapper(),userName);
		return listNguoiDung.isEmpty()?false:true;
	}
	@Override
	public void updateNguoiDung(NguoiDungModel nguoiDung) {
		StringBuilder sql = new StringBuilder("update tbl_nguoidung set ");
		sql.append(" hovaten = ? , ");
		sql.append(" email = ? , ");
		sql.append(" sodienthoai = ? , ");
		sql.append(" diachi = ? , ");
		sql.append(" socmnd = ? , ");
		sql.append(" image = ?  ");
		sql.append(" where ma_nguoidung = ? ");
		update(sql.toString(),nguoiDung.getHoVaTen(),nguoiDung.getEmail(),nguoiDung.getSoDienThoai(),nguoiDung.getDiaChi(),nguoiDung.getSoCMND(),nguoiDung.getImage(),nguoiDung.getMa_NguoiDung());
	}
	@Override
	public List<NguoiDungModel> findByMa_VaiTro(String ma_VaiTro) {
		StringBuilder sql = new StringBuilder("select * from tbl_nguoidung where ma_vaitro = ? ;");
		return query(sql.toString(), new NguoiDungMapper(), ma_VaiTro);
	}

}
