package org.onlineCart.purchase;

import java.util.Collection;
import org.onlineCart.exception.ItemNotFoundException;
import org.onlineCart.bean.Item;

public interface IPurchase {
	boolean addItem(Item p);
	boolean removeItem(String pid) throws ItemNotFoundException;
	Collection<Item> getCartDetails();
	Item getItemFromCart(String pid) throws ItemNotFoundException;
	int itemCount();
  double getCartPrice();
}
