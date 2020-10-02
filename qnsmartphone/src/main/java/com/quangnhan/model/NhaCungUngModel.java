package com.quangnhan.model;

public class NhaCungUngModel {
	private int ma_NCU;
	private String ten_NCU;
	private String diaChi_NCU;
	private String soDienThoai_NCU;
	private String email;
	private String tenCongTy;
	private String webSite;
	private String thongTinKhac;

	public NhaCungUngModel() {
	}

	public NhaCungUngModel(int ma_NCU, String ten_NCU, String diaChi_NCU, String soDienThoai_NCU, String email,
			String tenCongTy, String webSite, String thongTinKhac) {
		super();
		this.ma_NCU = ma_NCU;
		this.ten_NCU = ten_NCU;
		this.diaChi_NCU = diaChi_NCU;
		this.soDienThoai_NCU = soDienThoai_NCU;
		this.email = email;
		this.tenCongTy = tenCongTy;
		this.webSite = webSite;
		this.thongTinKhac = thongTinKhac;
	}

	public int getMa_NCU() {
		return ma_NCU;
	}

	public void setMa_NCU(int ma_NCU) {
		this.ma_NCU = ma_NCU;
	}

	public String getTen_NCU() {
		return ten_NCU;
	}

	public void setTen_NCU(String ten_NCU) {
		this.ten_NCU = ten_NCU;
	}

	public String getDiaChi_NCU() {
		return diaChi_NCU;
	}

	public void setDiaChi_NCU(String diaChi_NCU) {
		this.diaChi_NCU = diaChi_NCU;
	}

	public String getSoDienThoai_NCU() {
		return soDienThoai_NCU;
	}

	public void setSoDienThoai_NCU(String soDienThoai_NCU) {
		this.soDienThoai_NCU = soDienThoai_NCU;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getThongTinKhac() {
		return thongTinKhac;
	}

	public void setThongTinKhac(String thongTinKhac) {
		this.thongTinKhac = thongTinKhac;
	}

}
