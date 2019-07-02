package com.coding.constant;

import com.coding.datamodel.DiscountCard;
import com.coding.datamodel.PreciousMetal;
import com.coding.datamodel.Reduction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ProductInfo {
	public static final Map map = new HashMap();
	static {

		PreciousMetal one = new PreciousMetal();
		one.setPrice(new BigDecimal(998));
		one.setUnits("册");
		one.setProductNO("001001");
		one.setProductName("世园会五十国钱币册");
		map.put("001001",one);

		
		
		
		PreciousMetal two = new PreciousMetal();
		two.setPrice(new BigDecimal(1380));
		two.setUnits("盒");
		two.setProductNO("001002");
		two.setProductName("2019北京世园会纪念银章大全40g");
		
		List<DiscountCard> discountCardlist = new ArrayList<DiscountCard>();
		DiscountCard  discountCard1 = new DiscountCard();
		discountCard1.setDiscount(new BigDecimal("0.9"));
		discountCard1.setDiscountCardName(DiscountConstant.NINE_DISCOUNT);
		discountCardlist.add(discountCard1);
		two.setDiscountCardList(discountCardlist);
		map.put("001002",two);
		
		
		

		PreciousMetal three = new PreciousMetal();
		three.setPrice(new BigDecimal(1580));
		three.setUnits("条");
		three.setProductNO("003001");
		three.setProductName("招财进宝");
		
		
		List<DiscountCard> discountCardlist3 = new ArrayList<DiscountCard>();
		DiscountCard  discountCard13 = new DiscountCard();
		discountCard13.setDiscount(new BigDecimal("0.95"));
		discountCard13.setDiscountCardName(DiscountConstant.NINEFIVE_DISCOUNT);
		discountCardlist3.add(discountCard13);
		
		three.setDiscountCardList(discountCardlist3);
		map.put("003001",three);


		PreciousMetal four = new PreciousMetal();
		four.setPrice(new BigDecimal(998));
		four.setUnits("条");
		four.setProductNO("003002");
		four.setProductName("水晶之恋");
		List<Reduction> list = new ArrayList<Reduction>();
		Reduction reduction1 = new Reduction(ReductionConstant.THREE_REDUCE_HALFPRICE,null,null,3);
		Reduction reduction2 = new Reduction(ReductionConstant.THREE_GIVE_ONE,null,null,4);
		list.add(reduction1);
		list.add(reduction2);
		four.setReductionList(list);
		map.put("003002",four);


		PreciousMetal five = new PreciousMetal();
		five.setPrice(new BigDecimal(998));
		five.setUnits("套");
		five.setProductNO("002002");
		five.setProductName("中国经典钱币套装");
		List<Reduction> list1 = new ArrayList<Reduction>();
		Reduction reduction3 = new Reduction(ReductionConstant.TWOTHOUSAND_REDUCE,new BigDecimal(2000),new BigDecimal(30),0);
		Reduction reduction4 = new Reduction(ReductionConstant.ONETHOUSAND_REDUCE,new BigDecimal(1000),new BigDecimal(10),0);
		list1.add(reduction3);
		list1.add(reduction4);
		five.setReductionList(list1);
		map.put("002002",five);




		PreciousMetal seven = new PreciousMetal();
		seven.setPrice(new BigDecimal(1080.00));
		seven.setUnits("条");
		seven.setProductNO("002001");
		seven.setProductName("守扩之羽比翼双飞4.8g");
		seven.setReductionList(list);
		map.put("002001",seven);

		PreciousMetal six = new PreciousMetal();
		six.setPrice(new BigDecimal(698.00));
		six.setUnits("条");
		six.setProductNO("002003");
		six.setProductName("中国银象棋12g");
		six.setReductionList(list);
		Reduction reduction5 = new Reduction(ReductionConstant.THREETHOUSAND_REDUCE,new BigDecimal(3000),new BigDecimal(350),0);
		list1.add(reduction5);
		six.setReductionList(list1);
		map.put("002003",six);


		
	};

}
