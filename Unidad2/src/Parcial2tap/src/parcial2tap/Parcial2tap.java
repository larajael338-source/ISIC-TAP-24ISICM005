
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














//=====================================================
//  
//    // Panel superior con GridLayout para etiquetas y campos
//        JPanel panelEntrada = new JPanel
//
//        txtMercancia = new JTextField();
//        panelEntrada.add(txtNombre);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        // Panel superior con GridLayout para etiquetas y campos
//        JPanel panelEntrada = new JPanel(new GridLayout(3, 2, 5, 5));
//        PanelEntrada.
//        txtMercancia = new JTextField();
//        panelEntrada.add(txtNombre);
//
//        panelEntrada.add(new JLabel("Precio:"));
//        txtPrecio = new JTextField();
//        panelEntrada.add(txtPrecio);
//
//        panelEntrada.add(new JLabel("Cantidad:"));
//        txtCantidad = new JTextField();
//        panelEntrada.add(txtCantidad);
//
//        // 2. JTextArea dentro de un JScrollPane
//        areaTexto = new JTextArea();
//        areaTexto.setEditable(false);
//        JScrollPane scrollPane = new JScrollPane(areaTexto);
//
//        // Panel de botones
//        JPanel panelBotones = new JPanel();
//        btnAgregar = new JButton("Agregar");
//        btnLimpiar = new JButton("Limpiar");
//        btnSalir = new JButton("Salir");
//        panelBotones.add(btnAgregar);
//        panelBotones.add(btnLimpiar);
//        panelBotones.add(btnSalir);
//
//        // Agregar paneles al JFrame
//        add(panelEntrada, BorderLayout.NORTH);
//        add(scrollPane, BorderLayout.CENTER);
//        add(panelBotones, BorderLayout.SOUTH);
//
//        // --- Manejo de Eventos ---
//
//        // Botón Agregar (Punto 2 y 3)
//        btnAgregar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                agregarProducto();
//            }
//        });
//
//        // Botón Limpiar (Punto 4)
//        btnLimpiar.addActionListener(e -> limpiarCampos());
//
//        // Botón Salir (Punto 4)
//        btnSalir.addActionListener(e -> System.exit(0));
//
//        setVisible(true);
//    }
//
//    private void agregarProducto() {
//        // 3. Manejo de Excepciones y Validación
//        try {
//            String nombre = txtNombre.getText();
//            double precio = Double.parseDouble(txtPrecio.getText());
//            int cantidad = Integer.parseInt(txtCantidad.getText());
//
//            double subtotal = precio * cantidad;
//
//            // Concatenar información en el JTextArea
//            String registro = String.format("Producto: %s | Precio: %.2f | Cantidad: %d | Subtotal: %.2f\n",
//                    nombre, precio, cantidad, subtotal);
//            areaTexto.append(registro);
//
//        } catch (NumberFormatException ex) {
//            // Mensaje de error descriptivo
//            JOptionPane.showMessageDialog(this, 
//                "Error: El precio y la cantidad deben ser valores numéricos válidos.", 
//                "Error de Entrada", 
//                JOptionPane.ERROR_MESSAGE);
//        }
//    }
//
//    private void limpiarCampos() {
//        // 4. Control de Estado: Limpiar y devolver foco
//        txtNombre.setText("");
//        txtPrecio.setText("");
//        txtCantidad.setText("");
//        txtNombre.requestFocus();
//    }
//
//    public static void main(String[] args) {
//        // Ejecutar la aplicación
//        
//        SwingUtilities.invokeLater(() -> {
//            new Parcial2tap().setVisible(true);
//        });
//    }
//    }

    
    

      
        
        
        
        
