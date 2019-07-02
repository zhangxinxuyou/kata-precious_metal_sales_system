package com.coding.sales;

import java.math.BigDecimal;
import java.util.List;

import com.coding.constant.ProductInfo;
import com.coding.datamodel.DiscountCard;
import com.coding.datamodel.PreciousMetal;
import com.coding.datamodel.Reduction;
import com.coding.sales.input.OrderCommand;
import com.coding.sales.input.OrderItemCommand;
import com.coding.sales.output.OrderRepresentation;

/**
 * 销售系统的主入口
 * 用于打印销售凭证
 */
public class OrderApp {

    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("参数不正确。参数1为销售订单的JSON文件名，参数2为待打印销售凭证的文本文件名.");
        }

        String jsonFileName = args[0];
        String txtFileName = args[1];

        String orderCommand = FileUtils.readFromFile(jsonFileName);
        OrderApp app = new OrderApp();
        String result = app.checkout(orderCommand);
        FileUtils.writeToFile(result, txtFileName);
    }

    public String checkout(String orderCommand) {
        OrderCommand command = OrderCommand.from(orderCommand);
        OrderRepresentation result = checkout(command);
        
        return result.toString();
    }

    OrderRepresentation checkout(OrderCommand command) {
        OrderRepresentation result = null;

        //TODO: 请完成需求指定的功能
        
        List<OrderItemCommand> itemList =  command.getItems();
        
        BigDecimal totalPrice = new BigDecimal(0);
        
        BigDecimal totalDiscountAnReductiondPrice = new BigDecimal(0);
        
        
        
        
        for(OrderItemCommand orderItemCommand: itemList) {
        	String proNO =orderItemCommand.getProduct();
        	
        	BigDecimal amount =  orderItemCommand.getAmount();
        	
        	
        	PreciousMetal preciousMetal =  (PreciousMetal) ProductInfo.map.get(proNO);
        	//循环相加获得总金额
        	totalPrice= totalPrice.add(amount.multiply(preciousMetal.getPrice()));
        	
              	
        }
        //优惠后的金额先初始化为总金额
        totalDiscountAnReductiondPrice = totalDiscountAnReductiondPrice.add(totalPrice);
        
        for(OrderItemCommand orderItemCommand: itemList) {
        	String proNO =orderItemCommand.getProduct();
        	
        	BigDecimal amount =  orderItemCommand.getAmount();
        	
        	
        	PreciousMetal preciousMetal =  (PreciousMetal) ProductInfo.map.get(proNO);
        	//循环相加获得总金额
        	totalPrice= totalPrice.add(amount.multiply(preciousMetal.getPrice()));
        	
        	
        	List<Reduction> reductionList = preciousMetal.getReductionList();
        	
        	//获得满减优惠后的金额
   //==========================================获得满减优惠后的金额=====================  	
        	for(Reduction reduction : reductionList) {
        		BigDecimal tempTotalDiscountPrice = Reduction.getProductAmount(preciousMetal, amount, reduction);
        		
        		if(tempTotalDiscountPrice.compareTo(totalDiscountAnReductiondPrice)==-1) {
        			
        			totalDiscountAnReductiondPrice= tempTotalDiscountPrice;
        		}
        		
        	}
        	
        	
        	List<DiscountCard> discountCardList = preciousMetal.getDiscountCardList();
        	for(DiscountCard discountCard : discountCardList) {
        		BigDecimal tempTotalDiscountPrice = DiscountCard.getProductAmount(preciousMetal, amount, discountCard);
        		
        		if(tempTotalDiscountPrice.compareTo(totalDiscountAnReductiondPrice)==-1) {
        			
        			totalDiscountAnReductiondPrice= tempTotalDiscountPrice;
        		}
        		
        	}

        	
        }
    //================================================获得满减优惠后的金额=====================    
        
        //totalPrice 总金额
        //totalDiscountAnReductiondPrice满减和打折优惠后需要付款的今昔
        return result;
    }
}
