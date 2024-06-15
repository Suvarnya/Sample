package pack1;

public class UseCar {
	public static void main(String[] args) {
		Engine e=new Engine();
		e.setbrand("Godrej");
		e.setcc(1500);
		
		Car c=new Car();
		c.setbrand("Rolls Royce");
		c.setprice(20000000);
		c.setcolour("Black");
		c.setmileage(10);
		c.setisQuality(true);
		c.setEngine(e);
		
		System.out.println(c.getbrand()+" "+c.getprice()+" "+c.getcolour()+" "+c.getisQuality()+" "+c.getmileage()+" "+c.getEngine().getbrand()+" "+c.getEngine().getcc());
		
	}

}
