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
		
		List<DiscountCard> discountCardlist2 = new ArrayList<DiscountCard>();
		DiscountCard  discountCardNine = new DiscountCard();
		discountCardNine.setDiscount(new BigDecimal("0.9"));
		discountCardNine.setDiscountCardName(DiscountConstant.NINE_DISCOUNT);
		discountCardlist2.add(discountCardNine);
		two.setDiscountCardList(discountCardlist2);
		map.put("001002",two);
		
		
		

		PreciousMetal three = new PreciousMetal();
		three.setPrice(new BigDecimal(1580));
		three.setUnits("条");
		three.setProductNO("003001");
		three.setProductName("招财进宝");
		
		
		List<DiscountCard> discountCardlist3 = new ArrayList<DiscountCard>();
		DiscountCard  discountCardNineFive = new DiscountCard();
		discountCardNineFive.setDiscount(new BigDecimal("0.95"));
		discountCardNineFive.setDiscountCardName(DiscountConstant.NINEFIVE_DISCOUNT);
		discountCardlist3.add(discountCardNineFive);
		
		three.setDiscountCardList(discountCardlist3);
		map.put("003001",three);


		PreciousMetal four = new PreciousMetal();
		four.setPrice(new BigDecimal(998));
		four.setUnits("条");
		four.setProductNO("003002");
		four.setProductName("水晶之恋");
		List<Reduction> listFour = new ArrayList<Reduction>();
		Reduction reduction_THREE_REDUCE_HALFPRICE = new Reduction(ReductionConstant.THREE_REDUCE_HALFPRICE,null,null,new BigDecimal(3));
		Reduction reduction_THREE_GIVE_ONE = new Reduction(ReductionConstant.THREE_GIVE_ONE,null,null,new BigDecimal(4));
		listFour.add(reduction_THREE_REDUCE_HALFPRICE);
		listFour.add(reduction_THREE_GIVE_ONE);
		four.setReductionList(listFour);
		map.put("003002",four);


		PreciousMetal five = new PreciousMetal();
		five.setPrice(new BigDecimal(998));
		five.setUnits("套");
		five.setProductNO("002002");
		five.setProductName("中国经典钱币套装");
		List<Reduction> listFive = new ArrayList<Reduction>();
		Reduction reduction_TWOTHOUSAND_REDUCE = new Reduction(ReductionConstant.TWOTHOUSAND_REDUCE,new BigDecimal(2000),new BigDecimal(30),null);
		Reduction reduction_ONETHOUSAND_REDUCE = new Reduction(ReductionConstant.ONETHOUSAND_REDUCE,new BigDecimal(1000),new BigDecimal(10),null);
		listFive.add(reduction_TWOTHOUSAND_REDUCE);
		listFive.add(reduction_ONETHOUSAND_REDUCE);
		five.setReductionList(listFive);
		map.put("002002",five);




		PreciousMetal six = new PreciousMetal();
		six.setPrice(new BigDecimal(1080.00));
		six.setUnits("条");
		six.setProductNO("002001");
		six.setProductName("守扩之羽比翼双飞4.8g");
		List<Reduction> listSix = new ArrayList<Reduction>();
		listSix.add(reduction_THREE_REDUCE_HALFPRICE);
		listSix.add(reduction_THREE_GIVE_ONE);
		six.setReductionList(listSix);
		map.put("002001",six);

		
		
		PreciousMetal seven = new PreciousMetal();
		seven.setPrice(new BigDecimal(698.00));
		seven.setUnits("条");
		seven.setProductNO("002003");
		seven.setProductName("中国银象棋12g");
		List<Reduction> list7 = new ArrayList<Reduction>();
		Reduction reduction_THREETHOUSAND_REDUCE = new Reduction(ReductionConstant.THREETHOUSAND_REDUCE,new BigDecimal(3000),new BigDecimal(350),null);
		list7.add(reduction_TWOTHOUSAND_REDUCE);
		list7.add(reduction_ONETHOUSAND_REDUCE);
		seven.setReductionList(list7);
		
		List<DiscountCard> discountCardlist7 = new ArrayList<DiscountCard>();

		discountCardlist7.add(discountCardNine);
		seven.setDiscountCardList(discountCardlist7);
		map.put("002003",seven);


		
	};

}
