/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjava;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.*;

public class Vista extends javax.swing.JFrame {

    JLabel etiidProducto, etiNombre, etiPrecio, etiCantidad, etiproveedor, eti_id;
    JTextField txtNombre;
    JButton btnAgregar, btnEliminar,btnGuardar, btnPDF, etiLimpiar;
    JSpinner spPrecio, spCantidad;
    JComboBox Preveedor;
    JScrollPane scroll;
    JTable tblDatos;
    DefaultTableModel model;

    public Vista() {
        this.setVisible(true);
        this.setTitle("Paramore");
        this.setSize(700, 700);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        
       
       Image icon = new ImageIcon(getClass().getResource("/IMAGENES/Paramore-Album.png")).getImage();
        this.setIconImage(icon);

        etiidProducto = new JLabel("id_Producto");
        this.getContentPane().add(etiidProducto, new AbsoluteConstraints(10, 10, 90, 20));
         eti_id = new JLabel("ID");
        this.getContentPane().add(eti_id, new AbsoluteConstraints(120, 10, 50, 20));

        etiNombre = new JLabel("Nombre");
        this.getContentPane().add(etiNombre, new AbsoluteConstraints(10, 50, 50, 20));
        etiPrecio = new JLabel("Precio");
        this.getContentPane().add(etiPrecio, new AbsoluteConstraints(10, 90, 50, 20));

        etiCantidad = new JLabel("Cantidad");
        this.getContentPane().add(etiCantidad, new AbsoluteConstraints(10, 130, 50, 20));
        etiproveedor = new JLabel("Proveedor");
        this.getContentPane().add(etiproveedor, new AbsoluteConstraints(10, 170, 70, 20));

        txtNombre = new JTextField();
        this.getContentPane().add(txtNombre, new AbsoluteConstraints(120, 50, 90, 20));

        btnAgregar = new JButton("AGREGAR");
        this.getContentPane().add(btnAgregar, new AbsoluteConstraints(280, 10, 100, 20));
        btnEliminar = new JButton("ELIMINAR");
        this.getContentPane().add(btnEliminar, new AbsoluteConstraints(280, 60, 100, 20));
        btnGuardar = new JButton("GUARDAR");
        this.getContentPane().add(btnGuardar, new AbsoluteConstraints(280, 110, 100, 20));
        etiLimpiar = new JButton("LIMPIAR");
        this.getContentPane().add(etiLimpiar, new AbsoluteConstraints(280, 160, 100, 20));
        btnPDF = new JButton("PDF");
        this.getContentPane().add(btnPDF, new AbsoluteConstraints(280, 210, 100, 20));
        
                
        spPrecio = new JSpinner();
        this.getContentPane().add(spPrecio, new AbsoluteConstraints(120, 90, 90, 20));
        spCantidad = new JSpinner();
        this.getContentPane().add(spCantidad, new AbsoluteConstraints(120, 130, 90, 20));
        
        Object x[] = new Object[4];
        x[0] = "Barcel";
        x[1] = "Bimbo";
        x[2] = "Coca Cola";
        x[3] = "meria";
        Preveedor = new JComboBox(x);
        this.getContentPane().add(Preveedor, new AbsoluteConstraints(120, 170, 90, 20));

        tblDatos = new JTable();
        scroll = new JScrollPane();
        model = new DefaultTableModel();
        model.addColumn("id_Producto");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        model.addColumn("Proveedor");
        tblDatos.setModel(model);
        scroll.setViewportView(tblDatos);
        this.getContentPane().add(scroll, new AbsoluteConstraints(10, 270, 400,250));
        
        
        
        
         

    }
public static void main(String[] args) {
        Vista v = new Vista();

    }
  
}
