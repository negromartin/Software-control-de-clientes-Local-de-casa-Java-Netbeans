/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldeclientes;
import javax.swing.JOptionPane;
import static controldeclientes.VentanaCargarDeuda.ID_Deudor;
import static controldeclientes.VentanaCargarDeuda.apellido;
import static controldeclientes.VentanaCargarDeuda.nombre;
import java.awt.HeadlessException;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Martin
 */
public class ListaDeudas {
    private Nodo inicioCola, finalCola;
    
   
    
    public ListaDeudas(){
        inicioCola = null;
        finalCola = null;
    }
    public boolean ColaVacia(){
    if (inicioCola == null) {
           return true;
        
    }else{
        return false;
    }
}

    public void Insertar(int idDeud, int montoDeuda , String opcion , int montoA){
    Nodo nuevoNodo = new Nodo();
    
    nuevoNodo.idDeuda = idDeud;
    nuevoNodo.montoDeuda = montoDeuda;
    nuevoNodo.opcion = opcion;
    nuevoNodo.siguiente = null;

    if (ColaVacia()) {
        inicioCola = nuevoNodo;
        finalCola = nuevoNodo;
        
    } else { finalCola.siguiente = nuevoNodo;
        finalCola = nuevoNodo;
    }
}
  public void ActualizarBD() throws SQLException{
    Nodo recorrido = inicioCola;
    try{
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistemaclientes","root","");
             
    
    while(recorrido != null){
        
        if("1".equals(recorrido.opcion)){
             PreparedStatement pst = cn.prepareStatement("delete from deudas2 where ID_Deud = ?");
            pst.setInt(5, recorrido.idDeuda);
            pst.executeUpdate();
        
        }else if("2".equals(recorrido.opcion)){
            PreparedStatement pst = cn.prepareStatement("update deudas2 set Monto  where ID_Deud = " + recorrido.idDeuda);
           
           pst.setInt(3, recorrido.montoA );
           pst.executeUpdate();
           
        }
        recorrido = recorrido.siguiente;
    }
    
    }catch(SQLException e){}
    

    
}
    
}
