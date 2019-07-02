package com.coding.datamodel;

import java.math.BigDecimal;
import java.util.List;

import com.coding.constant.ReductionConstant;


public class Reduction {
    private String reductionName;
    
    //标识，是满减还是比较特殊的处理，
    
    private String type;
    
    private BigDecimal fullamount;
    
    private BigDecimal reduceAmount;
    
    //满减的数量的条件
    private int amount;
    
    public Reduction(String reductionName,BigDecimal fullamount,BigDecimal reduceAmount,int amount) {
    	this.reductionName= reductionName;
    	this.fullamount= fullamount;
    	this.reduceAmount= reduceAmount;
    	this.amount = amount;
    }
    
    /**
           *  得到满减活动后的金额
     * @param productPrice
     * @param productAmount
     * @param reductionName
     * @return
     */
	public static BigDecimal getProductAmount(PreciousMetal preciousMetal,BigDecimal productAmount,Reduction reduction) {
		
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
				
				//满足满减金额的类型,即普通类型
				if(proReduction.getType().equals(ReductionConstant.NORMAL_TYPE)) {
					//满足满减金额
					if(beforeaccount.compareTo(reduction.getFullamount())==1||beforeaccount.compareTo(reduction.getFullamount())==0) {		
					    BigDecimal lessCount = beforeaccount.divide(reduction.getFullamount(), BigDecimal.ROUND_HALF_UP);
					    returnAccount = beforeaccount.subtract(lessCount);
					    return returnAccount;
					}
					//不满足满减金额不做操作
				}else {
					//满足特殊满减类型
					
					if(proReduction.getReductionName().equals(ReductionConstant.THREE_REDUCE_HALFPRICE)) {
						//满足第3件半价
						if(productAmount.compareTo(new BigDecimal(reduction.getAmount()))==1||productAmount.compareTo(new BigDecimal(reduction.getAmount()))==0) {		
							 BigDecimal lessCount = beforeaccount.divide(reduction.getFullamount(), BigDecimal.ROUND_HALF_UP);
							 returnAccount = beforeaccount.subtract(preciousMetalPrice.multiply(new BigDecimal("0.5")));
							 return returnAccount;
						}
						
						
						
					}
					
					
					if(proReduction.getReductionName().equals(ReductionConstant.THREE_GIVE_ONE)) {
						//满足满3送1
						if(productAmount.compareTo(new BigDecimal(reduction.getAmount()))==1||productAmount.compareTo(new BigDecimal(reduction.getAmount()))==0) {		
						    BigDecimal lessCount = beforeaccount.divide(reduction.getFullamount(), BigDecimal.ROUND_HALF_UP);
						    returnAccount = beforeaccount.subtract(preciousMetalPrice);
						    return returnAccount;
						}
						
						
						
					}
					
					
					
				}
				
				
				
				
				
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	} 
	
	

}
