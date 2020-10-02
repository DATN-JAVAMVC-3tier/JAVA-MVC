package com.quangnhan.model;

public class SanPhamModel extends AbstractModel<SanPhamModel>{
	private int ma_SanPham;
	private String ten_SanPham;
	private String loai_SanPham;
	private String tag;
	private double diemDanhGia;
	private String images;
	private String mauSac;
	private String heDieuHanh;
	private String phienBan;
	private String kichThuoc_ManHinh;
	private String loai_ManHinh;
	private String camera_Truoc;
	private String camera_Sau;
	private String ketNoi;
	private String sim;
	private String wifi;
	private String gps;
	private String bluetooth;
	private String cong_KetNoi;
	private String loai_Pin;
	private String baoMat;
	private String ram;
	private String boNhoTrong;
	private String thongTinThem;
	private double gia_Ban;
	private int soLuongNhap;
	private int soLuongCon;
	private int giamGia;
	private String moTa_SanPham;
	private String thuongHieu;
	private String trangThai;
	public SanPhamModel() {
		super();
	}
	public SanPhamModel(int ma_SanPham, String ten_SanPham, String loai_SanPham, String tag, double diemDanhGia,
			String images, String mauSac, String heDieuHanh, String phienBan, String kichThuoc_ManHinh,
			String loai_ManHinh, String camera_Truoc, String camera_Sau, String ketNoi, String sim, String wifi,
			String gps, String bluetooth, String cong_KetNoi, String loai_Pin, String baoMat, String ram,
			String boNhoTrong, String thongTinThem, double gia_Ban, int soLuongNhap, int soLuongCon, int giamGia,
			String moTa_SanPham, String thuongHieu, String trangThai) {
		super();
		this.ma_SanPham = ma_SanPham;
		this.ten_SanPham = ten_SanPham;
		this.loai_SanPham = loai_SanPham;
		this.tag = tag;
		this.diemDanhGia = diemDanhGia;
		this.images = images;
		this.mauSac = mauSac;
		this.heDieuHanh = heDieuHanh;
		this.phienBan = phienBan;
		this.kichThuoc_ManHinh = kichThuoc_ManHinh;
		this.loai_ManHinh = loai_ManHinh;
		this.camera_Truoc = camera_Truoc;
		this.camera_Sau = camera_Sau;
		this.ketNoi = ketNoi;
		this.sim = sim;
		this.wifi = wifi;
		this.gps = gps;
		this.bluetooth = bluetooth;
		this.cong_KetNoi = cong_KetNoi;
		this.loai_Pin = loai_Pin;
		this.baoMat = baoMat;
		this.ram = ram;
		this.boNhoTrong = boNhoTrong;
		this.thongTinThem = thongTinThem;
		this.gia_Ban = gia_Ban;
		this.soLuongNhap = soLuongNhap;
		this.soLuongCon = soLuongCon;
		this.giamGia = giamGia;
		this.moTa_SanPham = moTa_SanPham;
		this.thuongHieu = thuongHieu;
		this.trangThai = trangThai;
	}
	public int getMa_SanPham() {
		return ma_SanPham;
	}
	public void setMa_SanPham(int ma_SanPham) {
		this.ma_SanPham = ma_SanPham;
	}
	public String getTen_SanPham() {
		return ten_SanPham;
	}
	public void setTen_SanPham(String ten_SanPham) {
		this.ten_SanPham = ten_SanPham;
	}
	public String getLoai_SanPham() {
		return loai_SanPham;
	}
	public void setLoai_SanPham(String loai_SanPham) {
		this.loai_SanPham = loai_SanPham;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public double getDiemDanhGia() {
		return diemDanhGia;
	}
	public void setDiemDanhGia(double diemDanhGia) {
		this.diemDanhGia = diemDanhGia;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public String getHeDieuHanh() {
		return heDieuHanh;
	}
	public void setHeDieuHanh(String heDieuHanh) {
		this.heDieuHanh = heDieuHanh;
	}
	public String getPhienBan() {
		return phienBan;
	}
	public void setPhienBan(String phienBan) {
		this.phienBan = phienBan;
	}
	public String getKichThuoc_ManHinh() {
		return kichThuoc_ManHinh;
	}
	public void setKichThuoc_ManHinh(String kichThuoc_ManHinh) {
		this.kichThuoc_ManHinh = kichThuoc_ManHinh;
	}
	public String getLoai_ManHinh() {
		return loai_ManHinh;
	}
	public void setLoai_ManHinh(String loai_ManHinh) {
		this.loai_ManHinh = loai_ManHinh;
	}
	public String getCamera_Truoc() {
		return camera_Truoc;
	}
	public void setCamera_Truoc(String camera_Truoc) {
		this.camera_Truoc = camera_Truoc;
	}
	public String getCamera_Sau() {
		return camera_Sau;
	}
	public void setCamera_Sau(String camera_Sau) {
		this.camera_Sau = camera_Sau;
	}
	public String getKetNoi() {
		return ketNoi;
	}
	public void setKetNoi(String ketNoi) {
		this.ketNoi = ketNoi;
	}
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getGps() {
		return gps;
	}
	public void setGps(String gps) {
		this.gps = gps;
	}
	public String getBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}
	public String getCong_KetNoi() {
		return cong_KetNoi;
	}
	public void setCong_KetNoi(String cong_KetNoi) {
		this.cong_KetNoi = cong_KetNoi;
	}
	public String getLoai_Pin() {
		return loai_Pin;
	}
	public void setLoai_Pin(String loai_Pin) {
		this.loai_Pin = loai_Pin;
	}
	public String getBaoMat() {
		return baoMat;
	}
	public void setBaoMat(String baoMat) {
		this.baoMat = baoMat;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getBoNhoTrong() {
		return boNhoTrong;
	}
	public void setBoNhoTrong(String boNhoTrong) {
		this.boNhoTrong = boNhoTrong;
	}
	public String getThongTinThem() {
		return thongTinThem;
	}
	public void setThongTinThem(String thongTinThem) {
		this.thongTinThem = thongTinThem;
	}
	public double getGia_Ban() {
		return gia_Ban;
	}
	public void setGia_Ban(double gia_Ban) {
		this.gia_Ban = gia_Ban;
	}
	public int getSoLuongNhap() {
		return soLuongNhap;
	}
	public void setSoLuongNhap(int soLuongNhap) {
		this.soLuongNhap = soLuongNhap;
	}
	public int getSoLuongCon() {
		return soLuongCon;
	}
	public void setSoLuongCon(int soLuongCon) {
		this.soLuongCon = soLuongCon;
	}
	public int getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}
	public String getMoTa_SanPham() {
		return moTa_SanPham;
	}
	public void setMoTa_SanPham(String moTa_SanPham) {
		this.moTa_SanPham = moTa_SanPham;
	}
	public String getThuongHieu() {
		return thuongHieu;
	}
	public void setThuongHieu(String thuongHieu) {
		this.thuongHieu = thuongHieu;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	
}
