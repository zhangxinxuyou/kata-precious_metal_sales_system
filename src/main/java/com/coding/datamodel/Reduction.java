package com.coding.datamodel;

import java.math.BigDecimal;
import java.util.List;


public class Reduction {
    private String reductionName;
    
    private BigDecimal fullamount;
    
    private BigDecimal reduceAmount;
    
    public Reduction(String reductionName,BigDecimal fullamount,BigDecimal reduceAmount) {
    	this.reductionName= reductionName;
    	this.fullamount= fullamount;
    	this.reduceAmount= reduceAmount;
    }
    
    /**
           *  得到满减活动后的金额
     * @param productPrice
     * @param productAmount
     * @param reductionName
     * @return
     */
	public BigDecimal getProductAmount(PreciousMetal preciousMetal,BigDecimal productAmount,Reduction reduction) {
		
		BigDecimal returnAccount = new BigDecimal("0");
		
		BigDecimal beforeaccount = new BigDecimal("0");
		
		BigDecimal preciousMetalPrice = preciousMetal.getPrice();
		
		beforeaccount = beforeaccount.add(productAmount.multiply(preciousMetalPrice));
		
		List<Reduction> reductionList = preciousMetal.getReductionList();
		
		
		//
		for(int i=0;i<reductionList.size();i++) {
			Reduction proReduction = reductionList.get(i);
			//商品没参加此满减活动，不做操作
			if(proReduction.getReductionName().equals(reduction.getReductionName())) {
				//满足满减金额
				if(beforeaccount.compareTo(fullamount)==1||beforeaccount.compareTo(fullamount)==0) {		
				    BigDecimal lessCount = beforeaccount.divide(reduction.getFullamount(), BigDecimal.ROUND_HALF_UP);
				    returnAccount = beforeaccount.subtract(lessCount);
				    break;
				}
				//不满足满减金额不做操作
					

			}
			
		}
		
		

		
		return returnAccount;
	}

	public String getReductionName() {
		return reductionName;
	}

	public void setReductionName(String reductionName) {
		this.reductionName = reductionName;
	}

	public BigDecimal getFullamount() {
		return fullamount;
	}

	public void setFullamount(BigDecimal fullamount) {
		this.fullamount = fullamount;
	}

	public BigDecimal getReduceAmount() {
		return reduceAmount;
	}

	public void setReduceAmount(BigDecimal reduceAmount) {
		this.reduceAmount = reduceAmount;
	} 
	
	

}
