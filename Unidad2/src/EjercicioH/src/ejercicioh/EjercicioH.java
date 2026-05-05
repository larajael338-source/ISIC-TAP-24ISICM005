package ejercicioh;

import javax.swing.*;
import java.awt.*;


//                  Ejercicio H: Control de Sistema.
// Demuestra el uso de JSlider y JProgressBar sincronizados mediante un ChangeListener.
 
public class EjercicioH extends JFrame {

    public EjercicioH() {
        setTitle("Ejercicio H: Control de Sistema");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        setLocationRelativeTo(null);

        // 1. JSlider: Selección de rango mediante deslizamiento
        JSlider slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBackground(Color.ORANGE);

        // 2. JProgressBar: Visualización de un estado de carga
        JProgressBar barra = new JProgressBar(0, 100);
        barra.setValue(50);
        barra.setStringPainted(true);
        barra.setBackground(Color.BLUE);

        // Evento: ChangeListener (específico para sliders)
        slider.addChangeListener(e -> {
            int valor = slider.getValue();
            barra.setValue(valor); // Sincroniza la barra con el slider
        });

        // Adición de componentes al frame
        add(new JLabel("Cancion: 'Tu Carcel' version Morat      \n     Nivel de sonido:"));
        add(slider);
        add(barra);
        setVisible(true);
    }


    
    public static void main(String[] args) {
     
        new EjercicioH();
    
        
    }
    
}
