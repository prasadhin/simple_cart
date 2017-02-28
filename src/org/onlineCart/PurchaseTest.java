package org.onlineCart;
import java.util.Iterator;
import org.onlineCart.bean.Item;
import org.onlineCart.purchase.Purchase;


public class PurchaseTest {

	public static void main(String[] args) {
		Purchase i = new Purchase("Prasad");		
		i.addItem(new Item("i101","Oranages",12,1));
		i.addItem(new Item("i102","Apples",4,1));
		i.addItem(new Item("i105","Watermelon",2,5));
		i.addItem(new Item("i103","Pineapple",3,4));
		i.addItem(new Item("i107","Jackfruit",1,10));

		System.out.print ("Order Placed By: "+i.uid);
		System.out.println("\nNo. of Items : "+i.itemCount());
		
		
		
		System.out.println ("Cart Total : £"+i.getCartPrice());   
		final Iterator<Item> it = i.getCartDetails().iterator();
		while(it.hasNext()){		
			System.out.println (it.next());
		}
	
		
	}

}
