package com.quangnhan.model;

public class TrangThaiDonHangModel {
	private int ma_TrangThai;
	private String thongTin_TrangThai;

	public TrangThaiDonHangModel() {
	}

	public TrangThaiDonHangModel(int ma_TrangThai, String thongTin_TrangThai) {
		super();
		this.ma_TrangThai = ma_TrangThai;
		this.thongTin_TrangThai = thongTin_TrangThai;
	}

	public int getMa_TrangThai() {
		return ma_TrangThai;
	}

	public void setMa_TrangThai(int ma_TrangThai) {
		this.ma_TrangThai = ma_TrangThai;
	}

	public String getThongTin_TrangThai() {
		return thongTin_TrangThai;
	}

	public void setThongTin_TrangThai(String thongTin_TrangThai) {
		this.thongTin_TrangThai = thongTin_TrangThai;
	}

}
