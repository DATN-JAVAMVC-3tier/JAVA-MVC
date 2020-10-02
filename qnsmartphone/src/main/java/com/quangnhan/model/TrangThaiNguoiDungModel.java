package com.quangnhan.model;

public class TrangThaiNguoiDungModel {
	private String ma_TrangThai;
	private String thongTin_TrangThai;

	public TrangThaiNguoiDungModel() {
	}

	public TrangThaiNguoiDungModel(String ma_TrangThai, String thongTin_TrangThai) {
		super();
		this.ma_TrangThai = ma_TrangThai;
		this.thongTin_TrangThai = thongTin_TrangThai;
	}

	public String getMa_TrangThai() {
		return ma_TrangThai;
	}

	public void setMa_TrangThai(String ma_TrangThai) {
		this.ma_TrangThai = ma_TrangThai;
	}

	public String getThongTin_TrangThai() {
		return thongTin_TrangThai;
	}

	public void setThongTin_TrangThai(String thongTin_TrangThai) {
		this.thongTin_TrangThai = thongTin_TrangThai;
	}

}
