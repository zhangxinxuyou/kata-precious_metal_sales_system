package com.coding.datamodel;

import java.math.BigDecimal;

import com.coding.constant.CustomerLevelConstant;

public class CustomerLevel {

	/**
	 * 用户等级
	 */
	private String CustomerLevel;
	/**
	 * 用户积分
	 */
	private Long customerIntegral;
	
	/**
	 *   根据用户付的钱增加积分
	 * @param payMoney
	 * @param customerLevel
	 * @return
	 * @throws Exception
	 */
	public Long addIntegral(BigDecimal payMoney, String customerLevel) throws Exception {
		BigDecimal customerIntegral = new BigDecimal("0");

		if (customerLevel == null || "".equals(customerLevel)) {
			throw new Exception("未传入客户等级");
		}
		if (CustomerLevelConstant.NORMAL.equals(customerLevel)) {
			customerIntegral = customerIntegral.add(payMoney.multiply( new BigDecimal("1")));
		}

		if(CustomerLevelConstant.GOLD.equals(customerLevel)){
			customerIntegral = customerIntegral.add(payMoney.multiply( new BigDecimal("1.5")));
		}
		
		if(CustomerLevelConstant.PLATINUM.equals(customerLevel)){
			customerIntegral = customerIntegral.add(payMoney.multiply( new BigDecimal("1.8")));
		}

		if (CustomerLevelConstant.DIAMOND.equals(customerLevel)) {
			customerIntegral = customerIntegral.add(payMoney.multiply( new BigDecimal("2")));
		}

		return customerIntegral.longValue();
	}
	
	/**
	 *   根据用户积分得到用户等级
	 * @param customerIntegral
	 * @return
	 */
	public String getCustomerLevel(Long customerIntegral) {
		String customerLevel="";
		if (customerIntegral < 10000) {

			customerLevel = CustomerLevelConstant.NORMAL;
		}
		if (customerIntegral >=10000 && customerIntegral<50000) {

			customerLevel = CustomerLevelConstant.GOLD;
		}
		if (customerIntegral >=50000 && customerIntegral<100000) {

			customerLevel = CustomerLevelConstant.PLATINUM;
		}
		if (customerIntegral >= 100000) {

			customerLevel = CustomerLevelConstant.NORMAL;
		}
		return customerLevel;
	}

	public String getCustomerLevel() {
		return CustomerLevel;
	}

	public void setCustomerLevel(String customerLevel) {
		CustomerLevel = customerLevel;
	}

	public Long getCustomerIntegral() {
		return customerIntegral;
	}

	public void setCustomerIntegral(Long customerIntegral) {
		this.customerIntegral = customerIntegral;
	}
	
}
