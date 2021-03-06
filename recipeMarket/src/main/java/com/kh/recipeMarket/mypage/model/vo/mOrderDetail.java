 package com.kh.recipeMarket.mypage.model.vo;

import java.sql.Date;

public class mOrderDetail {
	private String pName;
	private String mName;
	private String phName;
	private Date date;
	private int total;
	private int detailNo;
	private int orderNo;
	private int prCount;
	private int price;
	private int memNo;
	private int status;
	private int zip;
	private int productNo;
	private String address;
	private String address2;
	private String note;
	private int phone;
	private String reviewed;
	
	public mOrderDetail() {}

	public mOrderDetail(String pName, String mName, String phName, Date date, int total, int detailNo, int orderNo, int prCount,
			int price, int memNo, int status, int zip, int productNo, String address, String address2, String note, int phone, String reviewed) {
		super();
		this.productNo = productNo;
		this.pName = pName;
		this.mName = mName;
		this.phName = phName;
		this.date = date;
		this.total = total;
		this.detailNo = detailNo;
		this.orderNo = orderNo;
		this.prCount = prCount;
		this.price = price;
		this.memNo = memNo;
		this.status = status;
		this.zip = zip;
		this.address = address;
		this.address2 = address2;
		this.note = note;
		this.phone = phone;
		this.reviewed = reviewed;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getDetailNo() {
		return detailNo;
	}

	public void setDetailNo(int detailNo) {
		this.detailNo = detailNo;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getPrCount() {
		return prCount;
	}

	public void setPrCount(int prCount) {
		this.prCount = prCount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPhName() {
		return phName;
	}

	public void setPhName(String phName) {
		this.phName = phName;
	}

	public String getReviewed() {
		return reviewed;
	}

	public void setReviewed(String reviewed) {
		this.reviewed = reviewed;
	}

	@Override
	public String toString() {
		return "mOrderDetail [pName=" + pName + ", mName=" + mName + ", phName=" + phName + ", date=" + date
				+ ", total=" + total + ", detailNo=" + detailNo + ", orderNo=" + orderNo + ", prCount=" + prCount
				+ ", price=" + price + ", memNo=" + memNo + ", status=" + status + ", zip=" + zip + ", productNo="
				+ productNo + ", address=" + address + ", address2=" + address2 + ", note=" + note + ", phone=" + phone
				+ ", reviewed=" + reviewed + "]";
	}




}
