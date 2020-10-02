package com.quangnhan.model;

public class DetailOrderModel extends AbstractModel<DetailOrderModel>{
	
	private String hoVaTen;
	private String email;
	private String soDienThoai;
	private String diaChi;
	private String createcheck;
	private String tenDangNhap;
	private String matKhau;
	private String matKhauagain;
	private String ghiChu;
	private String phuongThucThanhToan;
	public DetailOrderModel() {
		super();
	}
	public DetailOrderModel(String hoVaTen, String email, String soDienThoai, String diaChi, String createcheck,
			String tenDangNhap, String matKhau, String matKhauagain, String ghiChu, String phuongThucThanhToan) {
		super();
		this.hoVaTen = hoVaTen;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.createcheck = createcheck;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.matKhauagain = matKhauagain;
		this.ghiChu = ghiChu;
		this.phuongThucThanhToan = phuongThucThanhToan;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
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
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getCreatecheck() {
		return createcheck;
	}
	public void setCreatecheck(String createcheck) {
		this.createcheck = createcheck;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getMatKhauagain() {
		return matKhauagain;
	}
	public void setMatKhauagain(String matKhauagain) {
		this.matKhauagain = matKhauagain;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public String getPhuongThucThanhToan() {
		return phuongThucThanhToan;
	}
	public void setPhuongThucThanhToan(String phuongThucThanhToan) {
		this.phuongThucThanhToan = phuongThucThanhToan;
	}
	
	
}
