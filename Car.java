package pack1;

public class Car {
	String brand;
    int price;
    String colour;
    int mileage;
    boolean isQuality;
    Engine engine;
    
    public void setEngine(Engine engine) {
         this.engine=engine;
    }
    public Engine getEngine() {
         return engine;
    }
    
    public void setbrand(String brand) {
         this.brand=brand;
    }
    public String getbrand() {
         return brand;
    }
    
    public void setprice(int price) {
         this.price=price;
    }
    public int getprice() {
         return price;
    }
    
    public void setcolour(String colour) {
         this.colour=colour;
    }
    public String getcolour() {
         return colour;
    }
    
    public void setmileage(int mileage) {
         this.mileage=mileage;
    }
    public int getmileage() {
         return mileage;
    }
    
    public void setisQuality(boolean isQuality) {
         this.isQuality=isQuality;
    }
    public boolean getisQuality() {
         return isQuality;
    }

}
