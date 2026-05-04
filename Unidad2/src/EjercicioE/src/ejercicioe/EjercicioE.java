package ejercicioe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Joha
 */
public class EjercicioE extends JFrame {
    
    public EjercicioE(){
       setTitle("EjercicioE: MouseListener");
       setSize(200,600);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new GridBagLayout());
       setLocationRelativeTo(null);
       
       
       JLabel etiqueta = new JLabel("Dslize", SwingConstants.CENTER);
       etiqueta.setPreferredSize(new Dimension(500,500));
       etiqueta.setOpaque(true);
       etiqueta.setBackground(Color.YELLOW);
       
       
       
     
         etiqueta.addMouseListener(new MouseAdapter(){
         
             @Override
             public void mouseExited(MouseEvent e){
                etiqueta.setBackground(Color.ORANGE);
            }

             @Override
             public void mouseEntered(MouseEvent e){
                etiqueta.setBackground(Color.BLUE);
            }

         });
       
       
       add(etiqueta);
     
       
       }
          public static void main(String[] args) {
       
        new EjercicioE().setVisible(true);
    
}
}
    
    
    

    
    
    
    
       
    
         
       
         
    
    
     

      


    

