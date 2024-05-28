package shop;

public class ClothingItem {
	private String name;
	private double price;
	private char size;

	public ClothingItem(String name, double price, char size) {
		super();
		this.name = name;
		this.price = price;
		if(size=='S'||size=='M'||size=='L') {
			this.size = size;	
		}
		else {
			System.out.println("error con talla, estableciendo S");
			this.size='S';
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		if(size=='S'||size=='M'||size=='L') {
			this.size = size;	
		}else {
			System.out.println("error con la talla");
		}
	}
	
	public boolean igual(ClothingItem c) {
        return c.getSize() == this.size && c.getName().equals(this.name);
	}
	@Override
	public String toString() {
		return "ClothingItem [name=" + name + ", price=" + price + ", size=" + size + "]";
	}
	

}
