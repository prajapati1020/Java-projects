package superamarket.product;

public class Beverages extends GroceryProduct{
//extends key word used to inheritance
	
	private SugarLevel sugarLevel;
	
	public Beverages(String name,double price , double discount,SugarLevel sugarLevel) {
		super(name,price,discount);
		this.sugarLevel = sugarLevel;
	}
	public String display() {
		return (super.display()+"\nSugar Level: "+sugarLevel);
	}
	public SugarLevel getSugarLevel() {
		return sugarLevel;
	}
	public void setSugarLevel(SugarLevel sugarLevel) {
		this.sugarLevel = sugarLevel;
	}
}
