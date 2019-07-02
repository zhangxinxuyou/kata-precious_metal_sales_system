package com.coding.sales;

import java.math.BigDecimal;
import java.util.List;

import com.coding.constant.ProductInfo;
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
        
        
        
        
        
        for(OrderItemCommand orderItemCommand: itemList) {
        	String proNO =orderItemCommand.getProduct();
        	BigDecimal amount =  orderItemCommand.getAmount();
        	
        	
        	PreciousMetal preciousMetal =  (PreciousMetal) ProductInfo.map.get(proNO);
        	
        	
        	
        	//Reduction.getProductAmount(preciousMetal, amount, reduction)
        	
        }
        

        return result;
    }
}
