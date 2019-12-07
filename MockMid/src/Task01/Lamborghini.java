package Task01;

public class Lamborghini extends Car{
       public int topSpeed;
       public static int totalCars;
       public void Lamborghini(){

       }
    public Lamborghini(String color, String manufacturer, String name){
        super(color,manufacturer,name);
        totalCars++;
    }
    public void setTopSpeed(int topSpeed){
       this.topSpeed=topSpeed;
    }
    public int totalCars(){
        return totalCars;
    }
    public void move(){
        System.out.println(this.manufacturer+" is moving");
        System.out.println("Top Speed of "+this.topSpeed);
    }



}
