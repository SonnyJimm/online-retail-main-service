package com.retail.InventoryService.form;

import java.util.Collection;

public class CreateOrderForm {
    private String discountCode;
    private Collection<OrderedItemForm> orderedItems;

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public Collection<OrderedItemForm> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(Collection<OrderedItemForm> orderedItems) {
        this.orderedItems = orderedItems;
    }
}
