package com.coding.datamodel;

import java.math.BigDecimal;
import java.util.List;

public class PreciousMetal {
	private String productName;
	private String productNO;
	private BigDecimal price;
	/**
	 * 单位
	 */
	private String units;
	/**
	 * 打折券
	 */
	private List<DiscountCard> discountCardList;
	/**
	 * 满减
	 */
	private List<Reduction> reductionList;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductNO() {
		return productNO;
	}
	public void setProductNO(String productNO) {
		this.productNO = productNO;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public List<DiscountCard> getDiscountCardList() {
		return discountCardList;
	}
	public void setDiscountCardList(List<DiscountCard> discountCardList) {
		this.discountCardList = discountCardList;
	}
	public List<Reduction> getReductionList() {
		return reductionList;
	}
	public void setReductionList(List<Reduction> reductionList) {
		this.reductionList = reductionList;
	}
	
	
	
	

}
