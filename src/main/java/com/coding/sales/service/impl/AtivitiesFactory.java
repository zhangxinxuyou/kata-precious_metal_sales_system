package com.coding.sales.service.impl;

import com.coding.sales.input.OrderCommand;
import com.coding.sales.service.PreciousMetalActivities;

public  class AtivitiesFactory {
    private PreciousMetalActivities preciousMetalActivities;

    public  AtivitiesFactory(PreciousMetalActivities preciousMetalActivities){
           super();
           this.preciousMetalActivities=preciousMetalActivities;
    }

    public void operating(OrderCommand order){

        preciousMetalActivities.activities(order);
    }
}
