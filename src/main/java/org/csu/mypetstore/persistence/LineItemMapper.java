package org.csu.mypetstore.persistence;

import org.csu.mypetstore.domain.LineItem;

import java.util.List;

public interface LineItemMapper {

    List<LineItem> getLineItemsByOrderId(int orderId);

    boolean insertLineItem(LineItem lineItem);
}
