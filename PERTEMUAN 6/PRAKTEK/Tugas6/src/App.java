public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
            Bicycle testBicycle=new Bicycle();
            testBicycle.color();
            Motorvehicle honda=new Motorvehicle();
            honda.get_speed(126);
            Motorcycle honda2=new Motorcycle();
            honda2.setGearFoot(2);
            System.out.println("numgear="+honda2.getGearFoot());
            car honda3= new car();
            honda3.setSeatBelt(1);
            System.out.println("setSeatBelt="+honda3.getSeatBelt());
    }
}
