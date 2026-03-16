//JOHANNY JAEL FUENTES LARA 24ISICM005
package ejercicioc;

import javax.swing.*;
import java.awt.*;

public class EjercicioC extends JFrame{
    
     public EjercicioC (){
        setTitle("GATOS");
        setSize(500,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout (2,4,5,5));
        for(int i=1 ; i<=6 ; i++){
         add(new JButton ("Gato " + i));
   
     }

       setVisible(true); 
        
    }
   
    public static void main(String[] args) {
    
       new EjercicioC(); 
    }
        
    }
    

