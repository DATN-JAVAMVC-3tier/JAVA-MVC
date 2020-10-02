package com.quangnhan.model;

public class VaiTroNguoiDungModel {
	private String ma_VaiTro;
	private String thongTin_VaiTro;

	public VaiTroNguoiDungModel() {
	}

	public VaiTroNguoiDungModel(String ma_VaiTro, String thongTin_VaiTro) {
		super();
		this.ma_VaiTro = ma_VaiTro;
		this.thongTin_VaiTro = thongTin_VaiTro;
	}

	public String getMa_VaiTro() {
		return ma_VaiTro;
	}

	public void setMa_VaiTro(String ma_VaiTro) {
		this.ma_VaiTro = ma_VaiTro;
	}

	public String getThongTin_VaiTro() {
		return thongTin_VaiTro;
	}

	public void setThongTin_VaiTro(String thongTin_VaiTro) {
		this.thongTin_VaiTro = thongTin_VaiTro;
	}

}
