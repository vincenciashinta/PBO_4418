
import java.awt.*; 
import java.awt.event.*;
public class Textfield1{  
public static void main(String args[]){  
    Frame f= new Frame("JavaAWT_IPUN");  
    f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        TextField t1,t2;  
        t1=new TextField("Selamat datang di latihan TextField.");  
        t1.setBounds(60,100, 200,30);  
        t2=new TextField("AWT Tutorial TextField");  
        t2.setBounds(60,150, 200,30);  
        f.add(t1); f.add(t2);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }
    
}
