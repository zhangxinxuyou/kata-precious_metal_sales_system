package com.coding.datamodel;

import java.math.BigDecimal;
import java.util.List;

public class DiscountCard {
	
	
     private String DiscountCardName;
     
     private BigDecimal discount;
    
    
     public static BigDecimal getProductAmount(PreciousMetal preciousMetal,BigDecimal productAmount,DiscountCard discountCard) {
    	BigDecimal returnAccount = new BigDecimal("0");
 		
 		BigDecimal beforeaccount = new BigDecimal("0");
 		
 		BigDecimal preciousMetalPrice = preciousMetal.getPrice();
 		
 		beforeaccount = beforeaccount.add(productAmount.multiply(preciousMetalPrice));
 		
 		List<DiscountCard> discountCardList = preciousMetal.getDiscountCardList();
 		
 		if(discountCardList==null||discountCardList.size()<1) {
 			return returnAccount;
 		}
 		for(int i=0;i<discountCardList.size();i++) {
 			
 			DiscountCard proDiscountCard=discountCardList.get(i);
 			if(proDiscountCard.getDiscountCardName().equals(discountCard.getDiscountCardName())) {
 				
 				returnAccount = beforeaccount.multiply(discountCard.getDiscount());
 			}
 		}
 		
 		
 		
 		return returnAccount;
 		
     }


	public String getDiscountCardName() {
		return DiscountCardName;
	}


	public void setDiscountCardName(String discountCardName) {
		DiscountCardName = discountCardName;
	}


	public BigDecimal getDiscount() {
		return discount;
	}


	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	

}
