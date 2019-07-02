package com.coding.sales.service.impl;

import com.coding.sales.input.OrderCommand;
import com.coding.sales.input.PaymentCommand;
import com.coding.sales.service.PreciousMetalActivities;

import java.math.BigDecimal;
import java.util.List;

public class FullReduction implements PreciousMetalActivities {

    @Override
    public BigDecimal activities(OrderCommand order) {
         BigDecimal amt = null;
         List <PaymentCommand> payment = order.getPayments();
         for(PaymentCommand pay: payment){
             amt =  amt.add(pay.getAmount());
         }
         BigDecimal threeThousand []  = {new BigDecimal(3000),new BigDecimal(350)};
         BigDecimal twoThousand []  = {new BigDecimal(2000),new BigDecimal(30)};
         BigDecimal oneThousand []  = {new BigDecimal(1000),new BigDecimal(10)};

         if(amt.compareTo(threeThousand[0])== 1){
             return  getLessAmount(amt,threeThousand[1]);
         }
         if(amt.compareTo(twoThousand[0])== 1){
            return  getLessAmount(amt,twoThousand[1]);
        }
        if(amt.compareTo(oneThousand[0])== 1){
            return  getLessAmount(amt,oneThousand[1]);
        }
        return amt;

    }
    public BigDecimal getLessAmount(BigDecimal totalAmt,BigDecimal lessAmt){

        BigDecimal lessCount = totalAmt.divide(lessAmt,BigDecimal.ROUND_HALF_UP);
        totalAmt = totalAmt.subtract(lessCount.multiply(lessAmt)) ;
        return  totalAmt;
    }
}
