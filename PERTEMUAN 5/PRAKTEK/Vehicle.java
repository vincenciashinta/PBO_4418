class Vehicle{
    public double speed=0;
    public String color="Orange";

    public Vehicle(){

    }
    public void gostraight(){
        System.out.println("Go straight");
    }
    
    public void turnleft(){
        System.out.println("Turn Left");
    }

    public void turnright(){
        System.out.println("Turn Right");
    }

    public String set_color(String new_color){
        this.color=new_color;
        return color;
    }

    public int set_speed(int speed){
        this.speed=speed;
        return speed;
    }
}

class Bicycle extends Vehicle{
   public Bicycle(){}
    public void Ringbell(){
        System.out.println("Kiring kring...");
    }
    public void color(){
        System.out.println("The color of Bicycle is:"+super.color);
    }
}

class Motorcycle extends Vehicle{
    public int sizeofengine=1;
    public String licenseplate="H 1 IDN";

    public Motorcycle(){}
    public Motorcycle (int sizeEng,String lcplate){
        this.sizeofengine=sizeEng;
        this.licenseplate=lcplate;
    }

    public int get_Sizeofengine(){
        return Sizeofengine;
    }

    public String get_licenseplate(){
        return licenseplate;
    }

    public void get_speed(int new_speed){
        System.out.println("This Motorcycle can reach maximum speed at:"+super.set_speed(new_speed));
    }



}

public class Vehicle{
    public static void main(String[] args){
        Bicycle testBicycle=new Bicycle();
        testBicycle.color();
        Motorcycle honda=new Motorcycle();
        honda.get_speed(126);
        
    }
}