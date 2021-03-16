import java.util.Scanner;

public class Luas4Persegipjg {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int p, l;
        double luas4persegipanjang;
        
        System.out.print("Inputkan pjg : ");
        p=input.nextInt();
        
        System.out.print("Inputkan lbr : ");
        l=input.nextInt(); 
        
        luas4persegipanjang=4*p*l;
        System.out.println("Luas 4 Persegi Panjang : "+luas4persegipanjang);
    }  
}