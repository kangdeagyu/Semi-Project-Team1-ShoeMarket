package com.javalec.dto;

import java.io.FileInputStream;
import java.sql.Date;

public class PurchaseDto {

	//  Field
	
	int purchaseNo;
	int productCode;
	int size;
	int purchaseQty;
	String userid;
	Date purchaseInsertdate;
	Date prtchaseDeletedate;
	String name;
	String fileName;
	FileInputStream file;
	
	
	
	// Constructor
	
	public PurchaseDto(int wkSeq, int wkCode, int wkSize, int wkQty, String wkId, Date wkPurchaseInsertdate) {
		// TODO Auto-generated constructor stub
	}















	// Method
	public int getPurchaseNo() {
		return purchaseNo;
	}


	public void setPurchaseNo(int purchaseNo) {
		this.purchaseNo = purchaseNo;
	}


	public int getProductCode() {
		return productCode;
	}


	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getPurchaseQty() {
		return purchaseQty;
	}


	public void setPurchaseQty(int purchaseQty) {
		this.purchaseQty = purchaseQty;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public Date getPurchaseInsertdate() {
		return purchaseInsertdate;
	}


	public void setPurchaseInsertdate(Date purchaseInsertdate) {
		this.purchaseInsertdate = purchaseInsertdate;
	}


	public Date getPrtchaseDeletedate() {
		return prtchaseDeletedate;
	}


	public void setPrtchaseDeletedate(Date prtchaseDeletedate) {
		this.prtchaseDeletedate = prtchaseDeletedate;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public FileInputStream getFile() {
		return file;
	}


	public void setFile(FileInputStream file) {
		this.file = file;
	}















	public int getCartQty() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
	
	
	
	
	
	
	
	
}// End
