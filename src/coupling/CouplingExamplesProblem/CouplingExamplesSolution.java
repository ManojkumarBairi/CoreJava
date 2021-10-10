package coupling.CouplingExamplesProblem;

class ShoppingCartEntry2{
	public float price;
	public int quantity;
	
	public float getTotalPrice() {
		return price * quantity;
	}
}

class ShoppingCart2 {
	public ShoppingCartEntry2[] items;
	
	public float getTotalPrice() {
		float totalPrice = 0;
		for(ShoppingCartEntry2 item : items) {
			totalPrice += item.getTotalPrice();
		}
		return totalPrice;
	}
}

class Order2 {
	private ShoppingCart2 cart;
	private float salesTax;
	
	public Order2(ShoppingCart2 cart, float salesTax) {
		this.cart = cart;
		this.salesTax = salesTax;
	}
	

	//Highly decoupled Solution
	public float orderTotalPrice() {
		float cartTotalPrice = 0;
		cartTotalPrice += cart.getTotalPrice() + salesTax;
		return cartTotalPrice;
	}
}
	
public class CouplingExamplesSolution {

	public static void main(String[] args) {
		

	}

}
