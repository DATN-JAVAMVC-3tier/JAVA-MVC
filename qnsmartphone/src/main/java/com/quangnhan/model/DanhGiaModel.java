package com.quangnhan.model;

public class DanhGiaModel {
	private int ma_DanhGia;
	private int ma_NguoiDung;
	private int ma_SanPham;
	private int diem_DanhGia;
	private String noiDung;
	private String thoiGian;

	public DanhGiaModel() {
	}

	public DanhGiaModel(int ma_DanhGia, int ma_NguoiDung, int ma_SanPham, int diem_DanhGia, String noiDung,
			String thoiGian) {
		super();
		this.ma_DanhGia = ma_DanhGia;
		this.ma_NguoiDung = ma_NguoiDung;
		this.ma_SanPham = ma_SanPham;
		this.diem_DanhGia = diem_DanhGia;
		this.noiDung = noiDung;
		this.thoiGian = thoiGian;
	}

	public int getMa_DanhGia() {
		return ma_DanhGia;
	}

	public void setMa_DanhGia(int ma_DanhGia) {
		this.ma_DanhGia = ma_DanhGia;
	}

	public int getMa_NguoiDung() {
		return ma_NguoiDung;
	}

	public void setMa_NguoiDung(int ma_NguoiDung) {
		this.ma_NguoiDung = ma_NguoiDung;
	}

	public int getMa_SanPham() {
		return ma_SanPham;
	}

	public void setMa_SanPham(int ma_SanPham) {
		this.ma_SanPham = ma_SanPham;
	}

	public int getDiem_DanhGia() {
		return diem_DanhGia;
	}

	public void setDiem_DanhGia(int diem_DanhGia) {
		this.diem_DanhGia = diem_DanhGia;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}

}
