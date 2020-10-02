package com.quangnhan.model;

public class BaoHanhModel {
	private int ma_BaoHanh;
	private String thoiGian;
	private String noiDung;
	private int ma_ChiTietDonHang;

	public BaoHanhModel() {
	}

	public BaoHanhModel(int ma_BaoHanh, String thoiGian, String noiDung, int ma_ChiTietDonHang) {
		super();
		this.ma_BaoHanh = ma_BaoHanh;
		this.thoiGian = thoiGian;
		this.noiDung = noiDung;
		this.ma_ChiTietDonHang = ma_ChiTietDonHang;
	}

	public int getMa_BaoHanh() {
		return ma_BaoHanh;
	}

	public void setMa_BaoHanh(int ma_BaoHanh) {
		this.ma_BaoHanh = ma_BaoHanh;
	}

	public String getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public int getMa_ChiTietDonHang() {
		return ma_ChiTietDonHang;
	}

	public void setMa_ChiTietDonHang(int ma_ChiTietDonHang) {
		this.ma_ChiTietDonHang = ma_ChiTietDonHang;
	}

}
