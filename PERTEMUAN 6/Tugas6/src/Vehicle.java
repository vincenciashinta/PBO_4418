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

class Motorvehicle extends Vehicle{
    public int sizeofengine=1;
    public String licenseplate="H 1 IDN";

    public Motorvehicle(){}
    public Motorvehicle (int sizeEng,String lcplate){
        this.sizeofengine=sizeEng;
        this.licenseplate=lcplate;
    }

    public int get_sizeofengine(){
        return sizeofengine;
    }

    public String get_licenseplate(){
        return licenseplate;
    }

    public void get_speed(int new_speed){
        System.out.println("This Motorcycle can reach maximum speed at:"+super.set_speed(new_speed));
    }



}

class Motorcycle extends Vehicle{
    public int numGear=0;
    public Motorcycle(){}
    public void setGearFoot(int numGear){
        this.numGear=numGear;
    }
    public int getGearFoot(){
        return numGear;
    }
}

class car extends Vehicle{
    Boolean seatbelt = false;

    car(){

    }

    public void setSeatBelt(int seatbelt){
        if (seatbelt == 1){
            this.seatbelt=true;
        }

    }
    Boolean getSeatBelt(){
        return seatbelt;
    }
}


