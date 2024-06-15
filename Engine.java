package pack2;

public class Engine {
	String brand;
	int cc;
	
	public Engine(String brand,int cc) {
		this.brand=brand;
		this.cc=cc;
	}
	
	public String toString() {
		return (brand+ " " +cc);
	}

}
