
package parcial2tap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Parcial2tap extends JFrame{

    
    public JTextField  txtMercancia;
    public JTextField  txtPrecio; 
    public JTextField  txtCantidad;
    public JTextArea   txtArea;
    public JButton     btnAgregar;
    public JButton     btnLimpiar;
    public JButton     btnSalir;
    
    public Parcial2tap() {
        
        setTitle("Gestion de Inventario {Johanny Jael Fuentes Lara}");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 5, 5, 5));
        
      
 
        // Etiquetas y campos

        
        add(new JLabel("Nombre de la mercancia: " ));
       
        txtMercancia = new JTextField();
        add(txtMercancia);
        txtMercancia.setBackground(Color.MAGENTA);
        javax.swing.JOptionPane.showMessageDialog(this, "Hola JOHANNY :) " + (" \n ") + txtMercancia.getText(), "Bienvenido al sistema" , javax.swing.JOptionPane.INFORMATION_MESSAGE);

        
        add(new JLabel("Precio:"));
       
        txtPrecio = new JTextField();
        add(txtPrecio);
        txtPrecio.setBackground(Color.MAGENTA);

        add(new JLabel("Cantidad:"));
        
        txtCantidad = new JTextField();
        add(txtCantidad);
        txtCantidad.setBackground(Color.MAGENTA);

        // Botón Agregar
        JButton btnAgregar = new JButton("Agregar");
        add(btnAgregar);
        btnAgregar.setBackground(Color.cyan);

        // Botón Limpiar
        JButton btnLimpiar = new JButton("Limpiar");
        add(btnLimpiar);
        btnLimpiar.setBackground(Color.green);

        // Botón Salir
        JButton btnSalir = new JButton("Salir");
        add(btnSalir);
        btnSalir.setBackground(Color.RED);

        // Área de texto con scroll
        txtArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(txtArea);
        add(scroll);

        // --- Evento Agregar ---
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = txtMercancia.getText();
                    double precio = Double.parseDouble(txtPrecio.getText());
                    int cantidad = Integer.parseInt(txtCantidad.getText());
                    double total = precio * cantidad;

                    txtArea.append("Producto: " + nombre + "\n" + 
                                   "  Precio:" + precio + "\n" +
                                   "  Cantidad:  " + cantidad  + "\n"+
                                   "  Total: " + total );
                } catch (NumberFormatException ex) {
                 JOptionPane.showMessageDialog(null,"Ingrese Mercancia", "Error",JOptionPane.ERROR_MESSAGE);    
                                                   
                }
            }
        });

        // --- Evento Limpiar ---
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtMercancia.setText("");
                txtPrecio.setText("");
                txtCantidad.setText("");
                txtArea.setText("");
                txtMercancia.requestFocus(); // foco al primer campo
            }
        });

        // --- Evento Salir ---
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Parcial2tap();
    }
}














