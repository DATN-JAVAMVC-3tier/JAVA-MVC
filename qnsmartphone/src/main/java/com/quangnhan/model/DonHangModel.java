package com.quangnhan.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class DonHangModel extends AbstractModel<DonHangModel>{
	private int ma_DonHang;
	private String phuongThucThanhToan;
	private String phuongThucMua;
	private double tongTien;
	private Timestamp thoiGianLap;
	private String ghiChu;
	private String TenNguoiNhan;
	private String diaChi;
	private String email;
	private String soDienThoai;
	private Timestamp thoiGianNhanHang;
	private String tinhTrang_DonHang;
	private int ma_KhachHang;
	private int ma_TrangThai;
	private int ma_KhuyenMai;
	private int ma_Shipper;
	private int ma_NhanVien;
	private TrangThaiDonHangModel trangThaiDonHangModel;
	private List<ChiTietDonHangModel> listChiTietDonHang;
	public DonHangModel() {
		listChiTietDonHang = new ArrayList<>();
		trangThaiDonHangModel = new TrangThaiDonHangModel();
	}

	
	public TrangThaiDonHangModel getTrangThaiDonHangModel() {
		return trangThaiDonHangModel;
	}

	public void setTrangThaiDonHangModel(TrangThaiDonHangModel trangThaiDonHangModel) {
		this.trangThaiDonHangModel = trangThaiDonHangModel;
	}

	public List<ChiTietDonHangModel> getListChiTietDonHang() {
		return listChiTietDonHang;
	}

	public void setListChiTietDonHang(List<ChiTietDonHangModel> listChiTietDonHang) {
		this.listChiTietDonHang = listChiTietDonHang;
	}

	public int getMa_DonHang() {
		return ma_DonHang;
	}

	public void setMa_DonHang(int ma_DonHang) {
		this.ma_DonHang = ma_DonHang;
	}

	public String getPhuongThucThanhToan() {
		return phuongThucThanhToan;
	}

	public void setPhuongThucThanhToan(String phuongThucThanhToan) {
		this.phuongThucThanhToan = phuongThucThanhToan;
	}

	public String getPhuongThucMua() {
		return phuongThucMua;
	}

	public void setPhuongThucMua(String phuongThucMua) {
		this.phuongThucMua = phuongThucMua;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public Timestamp getThoiGianLap() {
		return thoiGianLap;
	}

	public void setThoiGianLap(Timestamp thoiGianLap) {
		this.thoiGianLap = thoiGianLap;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getTenNguoiNhan() {
		return TenNguoiNhan;
	}

	public void setTenNguoiNhan(String tenNguoiNhan) {
		TenNguoiNhan = tenNguoiNhan;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public Timestamp getThoiGianNhanHang() {
		return thoiGianNhanHang;
	}

	public void setThoiGianNhanHang(Timestamp thoiGianNhanHang) {
		this.thoiGianNhanHang = thoiGianNhanHang;
	}

	public String getTinhTrang_DonHang() {
		return tinhTrang_DonHang;
	}

	public void setTinhTrang_DonHang(String tinhTrang_DonHang) {
		this.tinhTrang_DonHang = tinhTrang_DonHang;
	}

	public int getMa_KhachHang() {
		return ma_KhachHang;
	}

	public void setMa_KhachHang(int ma_KhachHang) {
		this.ma_KhachHang = ma_KhachHang;
	}



	public int getMa_TrangThai() {
		return ma_TrangThai;
	}


	public void setMa_TrangThai(int ma_TrangThai) {
		this.ma_TrangThai = ma_TrangThai;
	}


	public int getMa_KhuyenMai() {
		return ma_KhuyenMai;
	}

	public void setMa_KhuyenMai(int ma_KhuyenMai) {
		this.ma_KhuyenMai = ma_KhuyenMai;
	}

	public int getMa_Shipper() {
		return ma_Shipper;
	}

	public void setMa_Shipper(int ma_Shipper) {
		this.ma_Shipper = ma_Shipper;
	}

	public int getMa_NhanVien() {
		return ma_NhanVien;
	}

	public void setMa_NhanVien(int ma_NhanVien) {
		this.ma_NhanVien = ma_NhanVien;
	}

	


	
}
