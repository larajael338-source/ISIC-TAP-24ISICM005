//JOHANNY JAEL FUENTES LARA 24ISICM005

package ejerciciob;

import javax.swing.*;  // el * extrae todo sin limites 
import java.awt.*;

public class EjercicioB extends JFrame{
    
    public EjercicioB(){
        setTitle("Ventana de colores");
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());  
        
        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(Color.BLUE);
        panelNorte.add(new JLabel("Panel norte"));
        
         JPanel panelCentral = new JPanel();
        panelCentral.setBackground(Color.CYAN);
        panelCentral.add(new JLabel ("Panel central"));

         JPanel panelSur = new JPanel();
        panelSur.setBackground(Color.GREEN);
        panelSur.add(new JLabel ("Panel sur"));

         add(panelSur, BorderLayout.SOUTH);
         add(panelCentral, BorderLayout.CENTER);
        add(panelNorte, BorderLayout.NORTH);
        setVisible(true);
       
    }

    public static void main(String[] args) {
       
        new EjercicioB();
    }
        
        
       //jpanel es el indicador  
        
        
    }
    

