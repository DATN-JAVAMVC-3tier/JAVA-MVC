package com.quangnhan.model;

public class PhieuNhapModel {
	private int ma_PhieuNhap;
	private String ngayNhap;
	private int ma_NhanVien;
	private int ma_NCU;

	public PhieuNhapModel() {
	}

	public PhieuNhapModel(int ma_PhieuNhap, String ngayNhap, int ma_NhanVien, int ma_NCU) {
		super();
		this.ma_PhieuNhap = ma_PhieuNhap;
		this.ngayNhap = ngayNhap;
		this.ma_NhanVien = ma_NhanVien;
		this.ma_NCU = ma_NCU;
	}

	public int getMa_PhieuNhap() {
		return ma_PhieuNhap;
	}

	public void setMa_PhieuNhap(int ma_PhieuNhap) {
		this.ma_PhieuNhap = ma_PhieuNhap;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public int getMa_NhanVien() {
		return ma_NhanVien;
	}

	public void setMa_NhanVien(int ma_NhanVien) {
		this.ma_NhanVien = ma_NhanVien;
	}

	public int getMa_NCU() {
		return ma_NCU;
	}

	public void setMa_NCU(int ma_NCU) {
		this.ma_NCU = ma_NCU;
	}

}
