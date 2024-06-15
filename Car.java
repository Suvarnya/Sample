package pack2;
public class Car {
	String brand;
	int price;
	String colour;
	boolean isQuality;
	Engine engine;

	public Car(String brand, int price, String colour, boolean isQuality, Engine engine) {
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.isQuality = isQuality;
		this.engine = engine;
	}

	public String toString() {
		return brand + " " + price + " " + colour + " " + isQuality + " " + engine;
	}
}
