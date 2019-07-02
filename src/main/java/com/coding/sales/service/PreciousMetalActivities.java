package com.coding.sales.service;

import com.coding.sales.input.OrderCommand;

import java.math.BigDecimal;

public interface PreciousMetalActivities {
    BigDecimal activities(OrderCommand order);
}
