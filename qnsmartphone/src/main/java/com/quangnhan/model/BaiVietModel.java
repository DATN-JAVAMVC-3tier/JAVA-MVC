package com.quangnhan.model;

import java.sql.Timestamp;

public class BaiVietModel extends AbstractModel<BaiVietModel>{
	private int ma_BaiViet;
	private String tieuDe;
	private String noiDung;
	private String tag;
	private int nguoiTao;
	private Timestamp thoiGianTao;

	public BaiVietModel() {
	}

	public BaiVietModel(int ma_BaiViet, String tieuDe, String noiDung, String tag, int nguoiTao,
			Timestamp thoiGianTao) {
		this.ma_BaiViet = ma_BaiViet;
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.tag = tag;
		this.nguoiTao = nguoiTao;
		this.thoiGianTao = thoiGianTao;
	}

	public int getMa_BaiViet() {
		return ma_BaiViet;
	}

	public void setMa_BaiViet(int ma_BaiViet) {
		this.ma_BaiViet = ma_BaiViet;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getNguoiTao() {
		return nguoiTao;
	}

	public void setNguoiTao(int nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	public Timestamp getThoiGianTao() {
		return thoiGianTao;
	}

	public void setThoiGianTao(Timestamp thoiGianTao) {
		this.thoiGianTao = thoiGianTao;
	}

	

}
