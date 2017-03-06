package org.onlineCart.bean;

public class Item implements java.io.Serializable {
	
	public String iid;
	public String iname;
	public int qty;
	public double price;

	public Item(){}
	public Item(String iid, String iname, int qty, double price) {
		this.iid = iid;
		this.iname = iname;
		this.qty = qty;
		this.price = price;
	}
	
	public void setIid(String iid) {
		this.iid = iid; 
	}

	public void setIname(String iname) {
		this.iname = iname; 
	}

	public void setQty(int qty) {
		this.qty = qty; 
	}

	public void setPrice(double price) {
		this.price = price; 
	}

	public String getIid() {
		return (this.iid); 
	}

	public String getIname() {
		return (this.iname); 
	}

	public int getQty() {
		return (this.qty); 
	}

	public double getPrice() {
		return (this.price); 
	}

	public String toString() {
		String sep = System.getProperty("line.separator");
		StringBuffer buffer = new StringBuffer();
		buffer.append(sep);
		buffer.append("----- Item Detail ----- ");
		buffer.append(sep);
    buffer.append("\tItem id = ");
		buffer.append(iid);
		buffer.append(sep);
		buffer.append("\tItem Name = ");
		buffer.append(iname);
		buffer.append(sep);
		buffer.append("\tqty = ");
		buffer.append(qty);
		buffer.append(sep);
		buffer.append("\tprice = ");
		buffer.append("£"+price);
		buffer.append(sep);
		return buffer.toString();
	}//toString
}