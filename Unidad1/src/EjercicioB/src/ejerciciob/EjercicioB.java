package ejerciciob;

import javax.swing.*;
import java.awt.*;

public class EjercicioB extends JFrame{
    
    public EjercicioB(){
        setTitle("Mi segunda ventana - TAP");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());  
        
        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(Color.pink);
        panelNorte.add(new JLabel("Panel norte"));
        
         JPanel panelCentral = new JPanel();
        panelCentral.setBackground(Color.black);
        panelCentral.add(new JLabel ("Panel central"));

         JPanel panelSur = new JPanel();
        panelSur.setBackground(Color.yellow);
        panelSur.add(new JLabel ("Panel sur"));

         add(panelSur, BorderLayout.SOUTH);
         add(panelCentral, BorderLayout.CENTER);
        add(panelNorte, BorderLayout.NORTH);
        setVisible(true);
       
    }

    public static void main(String[] args) {
       
        new EjercicioB();
    }
        
        
        
        
        
    }
    

