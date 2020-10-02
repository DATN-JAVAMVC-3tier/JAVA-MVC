package com.quangnhan.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.quangnhan.dao.ISanPhamDAO;
import com.quangnhan.mapper.SanPhamAdminMapper;
import com.quangnhan.mapper.SanPhamMapper;
import com.quangnhan.model.SanPhamModel;

public class SanPhamDAO extends AbstractDAO<SanPhamModel> implements ISanPhamDAO {

	@Override
	public List<SanPhamModel> findAll() {
		StringBuilder sql = new StringBuilder("select * from tbl_sanpham");
		return query(sql.toString(), new SanPhamMapper());
	}

	@Override
	public SanPhamModel findById(int ma_SanPham) {
		StringBuilder sql = new StringBuilder(
				"select * from tbl_sanpham where ma_sanpham = ? and trangthai = 'active'");
		List<SanPhamModel> listSanPhamModel = query(sql.toString(), new SanPhamMapper(), ma_SanPham);
		return listSanPhamModel.isEmpty() ? null : listSanPhamModel.get(0);
	}

	@Override
	public List<SanPhamModel> findByLoaiSanPham(String loai_SanPham) {
		StringBuilder sql = new StringBuilder(
				"select * from tbl_sanpham where loai_sanpham = ? and trangthai = 'active' LIMIT 4 ");
		return query(sql.toString(), new SanPhamMapper(), loai_SanPham);
	}

	@Override
	public List<SanPhamModel> findByTag(String tag) {
		StringBuilder sql = new StringBuilder(
				"select * from tbl_sanpham where tag like ? and trangthai = 'active' LIMIT 5");
		return query(sql.toString(), new SanPhamMapper(), "%" + tag + "%");
	}

	@Override
	public List<SanPhamModel> findAllAndLimit(int start, int select) {
		// "select * from tbl_sanpham where trangthai = 'active' LIMIT ?,? "
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tbl_sanpham as sp " + " where trangthai = 'active' "
				+ " order by (select sum(soluong) as 'soluongban' " + " from tbl_chitietdonhang as ctdh "
				+ " where create_date between date_add(current_timestamp(), interval -1 month) AND current_timestamp() and ctdh.ma_sanpham = sp.ma_sanpham "
				+ " group by ctdh.ma_sanpham) desc " + " LIMIT ?,?; ");
		return query(sql.toString(), new SanPhamMapper(), start, select);
	}

	@Override
	public List<SanPhamModel> findByTrangThai(String trangthai) {
		StringBuilder sql = new StringBuilder("select * from tbl_sanpham where trangthai = ? ");
		return query(sql.toString(), new SanPhamMapper(), trangthai);
	}

	@Override
	public int save(SanPhamModel sanPhamModel) {
		StringBuilder sql = new StringBuilder(
				"insert into tbl_sanpham(ten_sanpham,loai_sanpham,tag,diemdanhgia,mausac,hedieuhanh,phienban,kichthuoc_manhinh,loai_manhinh,camera_truoc,camera_sau,ketnoi,sim,wifi,gps,bluetooth,cong_ketnoi,loai_pin,baomat,ram,bonhotrong,thongtinthem,gia_ban,soluongnhap,soluongcon,mota_sanpham,thuonghieu,trangthai)");
		sql.append(" Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		return insert(sql.toString(), sanPhamModel.getTen_SanPham(), sanPhamModel.getLoai_SanPham(),
				sanPhamModel.getTag(), sanPhamModel.getDiemDanhGia(), sanPhamModel.getMauSac(),
				sanPhamModel.getHeDieuHanh(), sanPhamModel.getPhienBan(), sanPhamModel.getKichThuoc_ManHinh(),
				sanPhamModel.getLoai_ManHinh(), sanPhamModel.getCamera_Truoc(), sanPhamModel.getCamera_Sau(),
				sanPhamModel.getKetNoi(), sanPhamModel.getSim(), sanPhamModel.getWifi(), sanPhamModel.getGps(),
				sanPhamModel.getBluetooth(), sanPhamModel.getCong_KetNoi(), sanPhamModel.getLoai_Pin(),
				sanPhamModel.getBaoMat(), sanPhamModel.getRam(), sanPhamModel.getBoNhoTrong(),
				sanPhamModel.getThongTinThem(), sanPhamModel.getGia_Ban(), sanPhamModel.getSoLuongNhap(),
				sanPhamModel.getSoLuongCon(), sanPhamModel.getMoTa_SanPham(), sanPhamModel.getThuongHieu(),
				sanPhamModel.getTrangThai());
	}

	@Override
	public List<SanPhamModel> findAllByStatusIsActive() {
		StringBuilder sql = new StringBuilder("select * from tbl_sanpham where trangthai = 'active'");
		return query(sql.toString(), new SanPhamMapper());
	}

	@Override
	public List<SanPhamModel> findByThuongHieu(String thuongHieu) {
		StringBuilder sql = new StringBuilder(
				"select * from tbl_sanpham where thuonghieu = ? and trangthai = 'active' LIMIT 4 ");
		return query(sql.toString(), new SanPhamMapper(), thuongHieu);
	}

	@Override
	public List<SanPhamModel> findAllByThuongHieuAndLimit(String thuongHieu, int start, int select) {
		StringBuilder sql = new StringBuilder(
				"select * from tbl_sanpham where trangthai = 'active' and thuonghieu = ? LIMIT ?,? ");
		return query(sql.toString(), new SanPhamMapper(), thuongHieu, start, select);
	}

	@Override
	public List<SanPhamModel> findAllByTenSanPham(String tenSanPham) {
		StringBuilder sql = new StringBuilder(
				"select * from tbl_sanpham where ten_sanpham like ? and trangthai = 'active' ");
		return query(sql.toString(), new SanPhamMapper(), "%" + tenSanPham + "%");
	}

	@Override
	public List<SanPhamModel> findAllByAdmin() {
		String sql = "select sp.ma_sanpham,sp.ten_sanpham,sp.loai_sanpham,sp.soluongcon,sp.soluongnhap, (select sum(ctdh.soluong) from tbl_chitietdonhang as ctdh inner join tbl_donhang as dh on dh.ma_donhang = ctdh.ma_donhang  where ctdh.ma_sanpham = sp.ma_sanpham and (dh.ma_trangthai != 8 and dh.ma_trangthai != 9 and dh.ma_trangthai != 10) group by ctdh.ma_sanpham) as 'soluongban', sp.gia_ban,sp.diemdanhgia,sp.thuonghieu,sp.trangthai from tbl_sanpham as sp order by (select sum(soluong) as 'soluongban' from tbl_chitietdonhang as ctdh where create_date between date_add(current_timestamp(), interval -1 month) AND current_timestamp() and ctdh.ma_sanpham = sp.ma_sanpham group by ctdh.ma_sanpham) desc ;";
		return query(sql, new SanPhamAdminMapper());
	}

	@Override
	public void deleteByMaSanPham(int ma_SanPham) {
		String sql = "delete from tbl_sanpham where ma_sanpham = ? ; ";
		update(sql, ma_SanPham);

	}

	@Override
	public int update(SanPhamModel sanPhamModel) {
		StringBuilder sql = new StringBuilder();
		if (sanPhamModel.getTrangThai() == null) {
			sanPhamModel.setTrangThai("active");
		}
		sql.append("update tbl_sanpham ");
		sql.append("set ten_sanpham = ? , ");
		sql.append(" loai_sanpham = ? , ");
		sql.append(" tag = ? , ");
		sql.append(" mausac = ? , ");
		sql.append(" hedieuhanh = ? , ");
		sql.append(" phienban = ? , ");
		sql.append(" kichthuoc_manhinh = ? , ");
		sql.append(" loai_manhinh = ? , ");
		sql.append(" camera_truoc = ? , ");
		sql.append(" camera_sau = ? , ");
		sql.append(" ketnoi = ? , ");
		sql.append(" sim = ? , ");
		sql.append(" wifi = ? , ");
		sql.append(" gps = ? , ");
		sql.append(" bluetooth = ? , ");
		sql.append(" cong_ketnoi = ? , ");
		sql.append(" loai_pin = ? , ");
		sql.append(" baomat = ? , ");
		sql.append(" ram = ? , ");
		sql.append(" bonhotrong = ? , ");
		sql.append(" gia_ban = ? , ");
		sql.append(" soluongnhap = ? , ");
		sql.append(" soluongcon = ? , ");
		sql.append(" giamgia = ? , ");
		sql.append(" thongtinthem = ? , ");
		sql.append(" mota_sanpham = ? , ");
		sql.append(" thuonghieu = ? , ");
		sql.append(" trangthai = ? ");
		sql.append("where ma_sanpham = ?  ");
		try {
			update(sql.toString(), sanPhamModel.getTen_SanPham(), sanPhamModel.getLoai_SanPham(), sanPhamModel.getTag(),
					sanPhamModel.getMauSac(), sanPhamModel.getHeDieuHanh(), sanPhamModel.getPhienBan(),
					sanPhamModel.getKichThuoc_ManHinh(), sanPhamModel.getLoai_ManHinh(), sanPhamModel.getCamera_Truoc(),
					sanPhamModel.getCamera_Sau(), sanPhamModel.getKetNoi(), sanPhamModel.getSim(),
					sanPhamModel.getWifi(), sanPhamModel.getGps(), sanPhamModel.getBluetooth(),
					sanPhamModel.getCong_KetNoi(), sanPhamModel.getLoai_Pin(), sanPhamModel.getBaoMat(),
					sanPhamModel.getRam(), sanPhamModel.getBoNhoTrong(), sanPhamModel.getGia_Ban(),
					sanPhamModel.getSoLuongNhap(), sanPhamModel.getSoLuongCon(), sanPhamModel.getGiamGia(),
					sanPhamModel.getThongTinThem(), sanPhamModel.getMoTa_SanPham(), sanPhamModel.getThuongHieu(),
					sanPhamModel.getTrangThai(), sanPhamModel.getMa_SanPham());
			return 1;
		} catch (Exception e) {
			return -1;
		}

	}

	@Override
	public int updateTrangThai(String trangThai, int ma_SanPham) {
		StringBuilder sql = new StringBuilder();
		sql.append(" update tbl_sanpham ");
		sql.append(" set trangthai = ? ");
		sql.append(" where ma_sanpham = ? ; ");
		try {
			update(sql.toString(), trangThai, ma_SanPham);
			return 1;
		} catch (Exception e) {
			return -1;
		}
	}
	
	@Override
	public List<SanPhamModel> findAllByGiaAndOrderBy(int tu, int den, String orderby) {
		StringBuilder sql = new StringBuilder("select * from tbl_sanpham where gia_ban >= ? and gia_ban <= ? and trangthai = 'active' ");
		if (orderby.equals("asc")) {
			sql.append("order by gia_ban asc ; ");
		}else {
			sql.append("order by gia_ban desc ; ");
		}
		return query(sql.toString(), new SanPhamMapper(), tu, den, orderby);
	}

	@Override
	public void updateSoluong(int ma_SanPham, int soLuong) {
		StringBuilder sql = new StringBuilder();
		sql.append(" update tbl_sanpham ");
		sql.append(" set soluongcon = soluongcon + ? ");
		sql.append(" where ma_sanpham = ? ; ");
		update(sql.toString(), soLuong, ma_SanPham);
	}
}
