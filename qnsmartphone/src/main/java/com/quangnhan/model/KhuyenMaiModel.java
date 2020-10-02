package com.quangnhan.model;

public class KhuyenMaiModel {
	private int ma_KhuyenMai;
	private String dieuKienApDung;
	private double donHangToiThieu;
	private double soTien_KhuyenMai;
	private String ngayBatDau;
	private String ngayKetThuc;
	private int soLuongMa;
	private String code;

	public KhuyenMaiModel() {

	}

	public KhuyenMaiModel(int ma_KhuyenMai, String dieuKienApDung, double donHangToiThieu, double soTien_KhuyenMai,
			String ngayBatDau, String ngayKetThuc, int soLuongMa, String code) {
		super();
		this.ma_KhuyenMai = ma_KhuyenMai;
		this.dieuKienApDung = dieuKienApDung;
		this.donHangToiThieu = donHangToiThieu;
		this.soTien_KhuyenMai = soTien_KhuyenMai;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.soLuongMa = soLuongMa;
		this.code = code;
	}

	public int getMa_KhuyenMai() {
		return ma_KhuyenMai;
	}

	public void setMa_KhuyenMai(int ma_KhuyenMai) {
		this.ma_KhuyenMai = ma_KhuyenMai;
	}

	public String getDieuKienApDung() {
		return dieuKienApDung;
	}

	public void setDieuKienApDung(String dieuKienApDung) {
		this.dieuKienApDung = dieuKienApDung;
	}

	public double getDonHangToiThieu() {
		return donHangToiThieu;
	}

	public void setDonHangToiThieu(double donHangToiThieu) {
		this.donHangToiThieu = donHangToiThieu;
	}

	public double getSoTien_KhuyenMai() {
		return soTien_KhuyenMai;
	}

	public void setSoTien_KhuyenMai(double soTien_KhuyenMai) {
		this.soTien_KhuyenMai = soTien_KhuyenMai;
	}

	public String getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(String ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public String getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(String ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public int getSoLuongMa() {
		return soLuongMa;
	}

	public void setSoLuongMa(int soLuongMa) {
		this.soLuongMa = soLuongMa;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
