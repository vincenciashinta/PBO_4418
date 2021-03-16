/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @vincenciashnt User
 */
public class Testsimplecircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        //circle1
       simplecircle mysimplecircle = new simplecircle();
       System.out.println("The area of the circle of radius" + mysimplecircle.radius + "is" + mysimplecircle.getarea());
       //circle2
       simplecircle mysimplecircle2 = new simplecircle(25);
       System.out.println("The area of the circle of radius" + mysimplecircle2.radius + "is" + mysimplecircle2.getarea());
       //circle3
       simplecircle mysimplecircle3 = new simplecircle(125);
       System.out.println("The area of the simple circle of radius" + mysimplecircle3.radius + "is" + mysimplecircle3.getarea());   
    }
}

class simplecircle {
    double radius;
    
    simplecircle() {
        radius = 1;
    }
    simplecircle(double newradius) {
        radius = newradius;
    }
    double getarea(){
        return radius * radius * 3.14;
    }
    double getperimeter(){
        return 2 * radius * 3.14;
    }
    void setradius(double newradius) {
        radius = newradius;
    }
    
}

