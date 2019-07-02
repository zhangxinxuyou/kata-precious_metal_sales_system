package com.coding.sales.service.impl;


import com.coding.datamodel.PreciousMetal;
import com.coding.sales.service.PreciousMetalActivities;
import java.math.BigDecimal;


public class Discounts implements PreciousMetalActivities {
    @Override
    public BigDecimal activities(PreciousMetal metal,BigDecimal amt) {
            BigDecimal lessamt = null;
            String discountcard = metal.getDiscountCard();
            BigDecimal price = metal.getPrice();
            BigDecimal discoutnine = new BigDecimal(0.1);
            BigDecimal discoutninefive = new BigDecimal(0.05);
            if(discountcard!=null && !discountcard.equals("")){
                if("九折券".equals(discountcard)){
                    lessamt=   amt.multiply(price).multiply(discoutnine);
                }
                if("九五折券".equals(discountcard)){
                    lessamt =  amt.multiply(price).multiply(discoutninefive);
                }
            }
            return  lessamt;

    }
}
