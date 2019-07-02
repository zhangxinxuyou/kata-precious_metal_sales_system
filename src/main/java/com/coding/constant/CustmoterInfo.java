package com.coding.constant;

import com.coding.datamodel.Custmoter;
import com.coding.datamodel.CustomerLevel;

import java.util.HashMap;
import java.util.Map;

public class CustmoterInfo {
    private static final Map map = new HashMap();
    static {
        Custmoter custmoter = new Custmoter();
        custmoter.setCardNo("6236609999");
        custmoter.setName("马丁");
        CustomerLevel customerLevel = new CustomerLevel();
        customerLevel.setCustomerLevel(CustomerLevelConstant.NORMAL);
        customerLevel.setCustomerIntegral(Long.valueOf(9860));
        map.put("6236609999",custmoter);


        Custmoter custmoter1 = new Custmoter();
        custmoter.setCardNo("6630009999");
        custmoter.setName("王立");
        CustomerLevel customerLevel1 = new CustomerLevel();
        customerLevel1.setCustomerLevel(CustomerLevelConstant.GOLD);
        customerLevel1.setCustomerIntegral(Long.valueOf(48860));
        map.put("6630009999",custmoter1);

        Custmoter custmoter2 = new Custmoter();
        custmoter.setCardNo("8230009999");
        custmoter.setName("李想");
        CustomerLevel customerLevel2 = new CustomerLevel();
        customerLevel2.setCustomerLevel(CustomerLevelConstant.PLATINUM);
        customerLevel2.setCustomerIntegral(Long.valueOf(98860));
        map.put("8230009999",custmoter2);

        Custmoter custmoter3 = new Custmoter();
        custmoter.setCardNo("9230009999");
        custmoter.setName("张三");
        CustomerLevel customerLevel3 = new CustomerLevel();
        customerLevel3.setCustomerLevel(CustomerLevelConstant.DIAMOND);
        customerLevel3.setCustomerIntegral(Long.valueOf(198860));
        map.put("9230009999",custmoter3);

    }
}
