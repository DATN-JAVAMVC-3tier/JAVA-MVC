package com.quangnhan.model;

public class StatisticalModel extends AbstractModel<StatisticalModel>{
	private int id;
	private String title;
	private String typeChar;
	private double[] datasets;
	private String[] labels;
    private String content;
    private int sumSoLuongBan;
    private String month;
	private double tongDoanhThu;
	private String action;
	public StatisticalModel() {
		super();
	}
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public double getTongDoanhThu() {
		return tongDoanhThu;
	}

	public void setTongDoanhThu(double tongDoanhThu) {
		this.tongDoanhThu = tongDoanhThu;
	}

	public int getSumSoLuongBan() {
		return sumSoLuongBan;
	}

	public void setSumSoLuongBan(int sumSoLuongBan) {
		this.sumSoLuongBan = sumSoLuongBan;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTypeChar() {
		return typeChar;
	}
	public void setTypeChar(String typeChar) {
		this.typeChar = typeChar;
	}
	public double[] getDatasets() {
		return datasets;
	}
	public void setDatasets(double[] datasets) {
		this.datasets = datasets;
	}
	public String[] getLabels() {
		return labels;
	}
	public void setLabels(String[] labels) {
		this.labels = labels;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
    
}
