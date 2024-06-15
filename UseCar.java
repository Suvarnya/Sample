package pack2;

public class UseCar {
public static void main(String args[]) {
	Engine e=new Engine("XYZ",1500);
	Car c=new Car("Audi",500000,"Black",true,e);
	System.out.println(c);
}
}
