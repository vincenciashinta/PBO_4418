import java.util.Scanner;

public class LuasBujursangkar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s;
        double luas;
        
        System.out.print("Inputkan Sisi : ");
        s=input.nextInt();
        
        luas=s*s;
        System.out.println("Luas Bujursangkar : "+luas);
    }  
}