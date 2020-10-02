package com.quangnhan.model;

public class NguoiDungModel extends AbstractModel<NguoiDungModel>{
	private int ma_NguoiDung;
	private String tenDangNhap;
	private String matKhau;
	private String hoVaTen;
	private String email;
	private String soDienThoai;
	private String diaChi;
	private double soDu;
	private String image;
	private String ngayTao;
	private String soCMND;
	private String anhCMND;
	private String tenChuThe;
	private String soThe;
	private String ngayHetHan;
	private String ma_CVC;
	private String ma_VaiTro;
	private String ma_TrangThai;
	private VaiTroNguoiDungModel VaiTroNguoiDung;
	private TrangThaiNguoiDungModel TrangThaiNguoiDung;

	public NguoiDungModel() {
		super();
	}

	public NguoiDungModel(int ma_NguoiDung, String tenDangNhap, String matKhau, String hoVaTen, String email,
			String soDienThoai, String diaChi, double soDu, String image, String ngayTao, String soCMND, String anhCMND,
			String tenChuThe, String soThe, String ngayHetHan, String ma_CVC, String ma_VaiTro, String ma_TrangThai,
			VaiTroNguoiDungModel vaiTroNguoiDung, TrangThaiNguoiDungModel trangThaiNguoiDung) {
		super();
		this.ma_NguoiDung = ma_NguoiDung;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.hoVaTen = hoVaTen;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.soDu = soDu;
		this.image = image;
		this.ngayTao = ngayTao;
		this.soCMND = soCMND;
		this.anhCMND = anhCMND;
		this.tenChuThe = tenChuThe;
		this.soThe = soThe;
		this.ngayHetHan = ngayHetHan;
		this.ma_CVC = ma_CVC;
		this.ma_VaiTro = ma_VaiTro;
		this.ma_TrangThai = ma_TrangThai;
		VaiTroNguoiDung = vaiTroNguoiDung;
		TrangThaiNguoiDung = trangThaiNguoiDung;
	}

	public int getMa_NguoiDung() {
		return ma_NguoiDung;
	}

	public void setMa_NguoiDung(int ma_NguoiDung) {
		this.ma_NguoiDung = ma_NguoiDung;
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

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(String ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getAnhCMND() {
		return anhCMND;
	}

	public void setAnhCMND(String anhCMND) {
		this.anhCMND = anhCMND;
	}

	public String getTenChuThe() {
		return tenChuThe;
	}

	public void setTenChuThe(String tenChuThe) {
		this.tenChuThe = tenChuThe;
	}

	public String getSoThe() {
		return soThe;
	}

	public void setSoThe(String soThe) {
		this.soThe = soThe;
	}

	public String getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(String ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public String getMa_CVC() {
		return ma_CVC;
	}

	public void setMa_CVC(String ma_CVC) {
		this.ma_CVC = ma_CVC;
	}

	public String getMa_VaiTro() {
		return ma_VaiTro;
	}


	public void setMa_VaiTro(String ma_VaiTro) {
		this.ma_VaiTro = ma_VaiTro;
	}

	public String getMa_TrangThai() {
		return ma_TrangThai;
	}

	public void setMa_TrangThai(String ma_TrangThai) {
		this.ma_TrangThai = ma_TrangThai;
	}
	public VaiTroNguoiDungModel getVaiTroNguoiDung() {
		return VaiTroNguoiDung;
	}

	public void setVaiTroNguoiDung(VaiTroNguoiDungModel vaiTroNguoiDung) {
		VaiTroNguoiDung = vaiTroNguoiDung;
	}

	public TrangThaiNguoiDungModel getTrangThaiNguoiDung() {
		return TrangThaiNguoiDung;
	}

	public void setTrangThaiNguoiDung(TrangThaiNguoiDungModel trangThaiNguoiDung) {
		TrangThaiNguoiDung = trangThaiNguoiDung;
	}



}
