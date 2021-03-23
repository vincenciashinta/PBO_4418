public class gameplayer {
    private double witdh;
    private double height;
    private int potitionX;
    private int potitionY;
    
    public gameplayer(){
        
    }
    public gameplayer(double witdh, double height, int potitionx, int potitiony){
    }
    void setDimension(double witdh, double height){
        this.witdh = witdh;
        this.height = height;
    }
    void setPotition(int potitionx, int potitiony){
        this.potitionX = potitionx;
        this.potitionY = potitiony;
    }
    double getwitdh(){
        return this.witdh;
    }
    double getheight(){
        return this.height;
    }
    int getx(){
        return this.potitionX;
    }
    int gety(){
        return this.potitionY;
    }
    void run(){
        System.out.println("Player is running");
    }
    void run(int incrementX){
        incrementX += potitionX;
        System.out.println("Player is running current X position= "+ incrementX);
    }
}