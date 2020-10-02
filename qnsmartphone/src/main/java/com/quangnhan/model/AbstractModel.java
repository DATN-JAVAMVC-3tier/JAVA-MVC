package com.quangnhan.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AbstractModel<T> {
	private Timestamp create_Date;
	private int create_By;
	private Timestamp update_Date;
	private int update_By;
	private int quantityProduct;
	private String action;
	private int soLuongDaBan;
	private String tenShipper;
	private String tenSP;
	public AbstractModel() {
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public AbstractModel(Timestamp create_Date, int create_By, Timestamp update_Date, int update_By) {
		this.create_Date = create_Date;
		this.create_By = create_By;
		this.update_Date = update_Date;
		this.update_By = update_By;
	}

	

	

	public String getTenShipper() {
		return tenShipper;
	}

	public void setTenShipper(String tenShipper) {
		this.tenShipper = tenShipper;
	}

	public int getSoLuongDaBan() {
		return soLuongDaBan;
	}

	public void setSoLuongDaBan(int soLuongDaBan) {
		this.soLuongDaBan = soLuongDaBan;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getQuantityProduct() {
		return quantityProduct;
	}

	public void setQuantityProduct(int quantityProduct) {
		this.quantityProduct = quantityProduct;
	}

	public Timestamp getCreate_Date() {
		return create_Date;
	}

	public void setCreate_Date(Timestamp create_Date) {
		this.create_Date = create_Date;
	}

	public int getCreate_By() {
		return create_By;
	}

	public void setCreate_By(int create_By) {
		this.create_By = create_By;
	}

	public Timestamp getUpdate_Date() {
		return update_Date;
	}

	public void setUpdate_Date(Timestamp update_Date) {
		this.update_Date = update_Date;
	}

	public int getUpdate_By() {
		return update_By;
	}

	public void setUpdate_By(int update_By) {
		this.update_By = update_By;
	}

	private int[] listMa_BaiViet;
	private List<T> listResult = new ArrayList<>();
	public List<T> getListResult() {
		return listResult;
	}

	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}

	public int[] getListMa_BaiViet() {
		return listMa_BaiViet;
	}

	public void setListMa_BaiViet(int[] listMa_BaiViet) {
		this.listMa_BaiViet = listMa_BaiViet;
	}
}
