package com.quangnhan.model;

import java.sql.Timestamp;

public class ChiTietDonHangModel extends AbstractModel<ChiTietDonHangModel>{
	private int ma_ChiTietDonHang;
	private int soLuong;
	private double giaTien;
	private Timestamp ngayBatDau_BaoHanh;
	private Timestamp ngayKetThuc_BaoHanh;
	private int ma_SanPham;
	private int ma_DonHang;

	public ChiTietDonHangModel() {
	}

	public ChiTietDonHangModel(int ma_ChiTietDonHang, int soLuong, double giaTien, Timestamp ngayBatDau_BaoHanh,
			Timestamp ngayKetThuc_BaoHanh, int ma_SanPham, int ma_DonHang) {
		super();
		this.ma_ChiTietDonHang = ma_ChiTietDonHang;
		this.soLuong = soLuong;
		this.giaTien = giaTien;
		this.ngayBatDau_BaoHanh = ngayBatDau_BaoHanh;
		this.ngayKetThuc_BaoHanh = ngayKetThuc_BaoHanh;
		this.ma_SanPham = ma_SanPham;
		this.ma_DonHang = ma_DonHang;
	}

	public int getMa_ChiTietDonHang() {
		return ma_ChiTietDonHang;
	}

	public void setMa_ChiTietDonHang(int ma_ChiTietDonHang) {
		this.ma_ChiTietDonHang = ma_ChiTietDonHang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}

	public Timestamp getNgayBatDau_BaoHanh() {
		return ngayBatDau_BaoHanh;
	}

	public void setNgayBatDau_BaoHanh(Timestamp ngayBatDau_BaoHanh) {
		this.ngayBatDau_BaoHanh = ngayBatDau_BaoHanh;
	}

	public Timestamp getNgayKetThuc_BaoHanh() {
		return ngayKetThuc_BaoHanh;
	}

	public void setNgayKetThuc_BaoHanh(Timestamp ngayKetThuc_BaoHanh) {
		this.ngayKetThuc_BaoHanh = ngayKetThuc_BaoHanh;
	}

	public int getMa_SanPham() {
		return ma_SanPham;
	}

	public void setMa_SanPham(int ma_SanPham) {
		this.ma_SanPham = ma_SanPham;
	}

	public int getMa_DonHang() {
		return ma_DonHang;
	}

	public void setMa_DonHang(int ma_DonHang) {
		this.ma_DonHang = ma_DonHang;
	}

}
