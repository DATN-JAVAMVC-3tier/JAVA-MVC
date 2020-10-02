package com.quangnhan.model;

public class ChiTietPhieuNhapModel {
	private int ma_PhieuNhap;
	private int ma_SanPham;
	private int soLuong;
	private double giaNhap;

	public ChiTietPhieuNhapModel() {
	}

	public ChiTietPhieuNhapModel(int ma_PhieuNhap, int ma_SanPham, int soLuong, double giaNhap) {
		super();
		this.ma_PhieuNhap = ma_PhieuNhap;
		this.ma_SanPham = ma_SanPham;
		this.soLuong = soLuong;
		this.giaNhap = giaNhap;
	}

	public int getMa_PhieuNhap() {
		return ma_PhieuNhap;
	}

	public void setMa_PhieuNhap(int ma_PhieuNhap) {
		this.ma_PhieuNhap = ma_PhieuNhap;
	}

	public int getMa_SanPham() {
		return ma_SanPham;
	}

	public void setMa_SanPham(int ma_SanPham) {
		this.ma_SanPham = ma_SanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}

}
