
public class MenuItem {
	private String itemName;
	private String description;
	private double price;
	
	public MenuItem(String itemName, String description, String price)
	{
		this.itemName = itemName;
		this.description = description;
		this.price = Double.parseDouble(price);
	}
	
	public String getItemName() 
	{
		return itemName;
	}
	
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
}
