import java.util.*;

public class Item {

	private String name;
	private double price_per_item;
	private String expire_date;
	private int numberOfItem;
	
	public Item(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	public double getPrice() {
		return this.price_per_item;
	}
	
	public void setPrice(double newPrice) {
		this.price_per_item = newPrice;
	}
	public String getExpireDate() {
		return this.expire_date;
	}
	
	public void setExpireDate(String newDate) {
		this.expire_date = newDate;
	}
	
	public int getNumberOfItem() {
		return this.numberOfItem;
	}
	public void setNumberOfItem(int newAmount) {
		this.numberOfItem = newAmount;
	}
}


