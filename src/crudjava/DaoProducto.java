/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjava;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoProducto {

    Conexion cx;
    Producto p;

    public DaoProducto() {
        cx = new Conexion();

    }

    public boolean Create(Producto p) {
        try {
            String sql="INSERT INTO producto(Nombre,Precio,Cantidad,Proveedor) VALUES(?,?,?,?)";
            PreparedStatement ps = cx.conectar().prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getPrecio());
            ps.setInt(3, p.getCantidad());
            ps.setString(4, p.getProveedor());
            
            ps.execute();
            ps.close();
            ps=null;
            cx.Cerrar();
             return true;
        } catch (SQLException e) {
            
            return false;
        }
       
    }
    public ArrayList<Producto> read(){
         ArrayList<Producto>Lista= new ArrayList<Producto>();
        try {
           
            String sql="SELECT * FROM producto";
            PreparedStatement ps=cx.conectar().prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            Producto p=new Producto();
            p.setId_producto(rs.getInt("id_producto"));
            p.setNombre(rs.getString("Nombre"));
            p.setPrecio(rs.getInt("Precio"));
            p.setCantidad(rs.getInt("Cantidad"));
            p.setProveedor(rs.getString("Proveedor"));
            Lista.add(p);
            
        }
        ps.close();
        ps=null;
        cx.Cerrar();
        
        } catch (SQLException ex) {
            System.out.println("fallo moto read");
        }
        return Lista;
        
    }
    public boolean delete(int id){
        try {
            String sql="DELETE FROM producto WHERE id_producto=?";
            PreparedStatement ps=cx.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            ps=null;
            cx.Cerrar();
            return true;
        } catch (SQLException ex) {
            return false;
        }
       
        
    }
    public boolean update(Producto p ){
        try {
            String sql="UPDATE producto SET Nombre=?,Precio=?,Cantidad=?,Proveedor=? WHERE id_producto=?";
            PreparedStatement ps = cx.conectar().prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getPrecio());
            ps.setInt(3, p.getCantidad());
            ps.setString(4, p.getProveedor());
             ps.setInt(4, p.getId_producto());
            
            ps.execute();
            ps.close();
            ps=null;
            cx.Cerrar();
             return true;
        } catch (SQLException e) {
            
            return false;
        }
        
    }
    public Producto read(int id){
        Producto p=new Producto();
        try {
           
            String sql="SELECT * FROM producto WHERE id_producto=?";
            PreparedStatement ps=cx.conectar().prepareStatement(sql);
            ps.setInt(1, id);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
          
            p.setId_producto(rs.getInt("id_producto"));
            p.setNombre(rs.getString("Nombre"));
            p.setPrecio(rs.getInt("Precio"));
            p.setCantidad(rs.getInt("Cantidad"));
            p.setProveedor(rs.getString("Proveedor"));
           
            
        }
        ps.close();
        ps=null;
        cx.Cerrar();
        
        } catch (SQLException ex) {
            System.out.println("fallo moto read producto");
        }
        return p;
        
    }

}
