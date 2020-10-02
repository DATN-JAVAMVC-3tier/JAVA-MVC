package com.quangnhan.model;

public class ResultMesageModel {
	private int ma_DonHang;
	private String MESAGE_BG;
	private String MESAGE;
	private String ACTION;
	public ResultMesageModel() {

	}

	public ResultMesageModel(int ma_DonHang, String mESAGE_BG, String mESAGE, String aCTION) {
		super();
		this.ma_DonHang = ma_DonHang;
		MESAGE_BG = mESAGE_BG;
		MESAGE = mESAGE;
		ACTION = aCTION;
	}

	public ResultMesageModel(int ma_DonHang, String mESAGE_BG, String mESAGE) {
		super();
		this.ma_DonHang = ma_DonHang;
		MESAGE_BG = mESAGE_BG;
		MESAGE = mESAGE;
	}

	public String getACTION() {
		return ACTION;
	}

	public void setACTION(String aCTION) {
		ACTION = aCTION;
	}

	public int getMa_DonHang() {
		return ma_DonHang;
	}

	public void setMa_DonHang(int ma_DonHang) {
		this.ma_DonHang = ma_DonHang;
	}

	public String getMESAGE_BG() {
		return MESAGE_BG;
	}

	public void setMESAGE_BG(String mESAGE_BG) {
		MESAGE_BG = mESAGE_BG;
	}

	public String getMESAGE() {
		return MESAGE;
	}

	public void setMESAGE(String mESAGE) {
		MESAGE = mESAGE;
	}

}
