package com.quangnhan.paging;

public class Paging {
	private String nameTable;
	private String nameColWhere;
	private String value;
	private int rowCount;
	private int currentItem;
	private int selectItem;
	public Paging() {
		super();
	}
	public Paging(String nameTable, String nameColWhere, String value, int rowCount, int currentItem, int selectItem) {
		super();
		this.nameTable = nameTable;
		this.nameColWhere = nameColWhere;
		this.value = value;
		this.rowCount = rowCount;
		this.currentItem = currentItem;
		this.selectItem = selectItem;
	}
	public String getNameTable() {
		return nameTable;
	}
	public void setNameTable(String nameTable) {
		this.nameTable = nameTable;
	}
	public String getNameColWhere() {
		return nameColWhere;
	}
	public void setNameColWhere(String nameColWhere) {
		this.nameColWhere = nameColWhere;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public int getCurrentItem() {
		return currentItem;
	}
	public void setCurrentItem(int currentItem) {
		this.currentItem = currentItem;
	}
	public int getSelectItem() {
		return selectItem;
	}
	public void setSelectItem(int selectItem) {
		this.selectItem = selectItem;
	}
	
}
