/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjava;


public class Producto {
    int id_producto;
    String Nombre,Proveedor;
    int Precio, Cantidad;

    public Producto() {
    }

    public Producto(int id_producto, String Nombre, String Proveedor, int Precio, int Cantidad) {
        this.id_producto = id_producto;
        this.Nombre = Nombre;
        this.Proveedor = Proveedor;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
    }

    public Producto(String Nombre, String Proveedor, int Precio, int Cantidad) {
        this.Nombre = Nombre;
        this.Proveedor = Proveedor;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
}

    

    

    
    