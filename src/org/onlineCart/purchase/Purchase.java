package org.onlineCart.purchase;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Collection;
import org.onlineCart.exception.ItemNotFoundException;
import org.onlineCart.bean.Item;
public class Purchase implements IPurchase{
	public String uid;
	private Map<String, Item> map;
	
	public Purchase(){}
	public Purchase(String uid){
		this.uid=uid;
		map = new HashMap<String, Item>();
	}//Purchase
	
	public boolean addItem(Item p){
		if(map.containsKey(p.getIid())){
			Item p1 = map.get(p.getIid());
			p1.setPrice(p1.getPrice()+p.getPrice());
			p1.setQty(p1.getQty()+p.getQty());
			return true;	
		}
		map.put(p.getIid(),p);
		return false;
	}//addItem
	
	public boolean removeItem(String iid) throws ItemNotFoundException {
		if(map.containsKey(iid)){
			map.remove(iid);
			return true;
		}else throw new ItemNotFoundException(
      "Item with ID "+iid+" is not Found.");
	}
	
	public Collection<Item> getCartDetails(){
		return map.values();
	}
	
	public Item getItemFromCart(String iid) 
    throws ItemNotFoundException {
		if(map.containsKey(iid)){
			return map.get(iid);
		}else {
			throw new ItemNotFoundException(
        "Product with ID "+iid+" is not Found.");
		}
	}
	
	public int itemCount(){
		return map.size();
	}
  
  public double getCartPrice() {
    double price = 0.0d;
    Iterator<Item> iterator = getCartDetails().iterator();
    while(iterator.hasNext()){
      price+= iterator.next().getPrice();
    }
    return price;
  }

}
