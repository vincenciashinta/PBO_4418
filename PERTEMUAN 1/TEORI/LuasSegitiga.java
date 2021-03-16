import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, t;
        double luas;
        
        System.out.print("Inputkan alas : ");
        a=input.nextInt();
        System.out.print("Inputkan tinggi : ");
        t=input.nextInt();
        
        luas=0.5*a*t;
        System.out.println("Luas Segitiga : "+luas);
    }  
}