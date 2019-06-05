/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldeclientes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ClaseTransaccion {
public static int ID_Deudor;    
    
public ClaseTransaccion(){
 VentanaCargarPago objeto = new VentanaCargarPago();
 
    
    
 this.ID_Deudor = objeto.ID_Deudor;


}

public void Transaccion(int montoP){
     
    int montoD, id_Deuda;
    try{
           Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/sistemaclientes","root","");
           PreparedStatement pst1 = cn2.prepareStatement("select * from deduas2 where ID_Deudor=?");
           pst1.setInt(1,this.ID_Deudor);
           
           ResultSet result = pst1.executeQuery();
           
           if(result.next()){
               
              do{
               id_Deuda= result.getInt(5);   
               montoD = result.getInt(3);
               
               if(montoD == montoP){
               montoP = 0;
               PreparedStatement pst2 = cn2.prepareStatement("delete from deudas2 where ID_Deuda = ?");
                pst2.setInt(5, id_Deuda);
                pst2.executeUpdate();
               
               
               }else{
                   if(montoD < montoP){
                   montoP -= montoD; 
                   PreparedStatement pst2 = cn2.prepareStatement("delete from deudas2 where ID_Deuda = ? ");
                     pst2.setInt(5, id_Deuda);       
                     pst2.executeUpdate();
                   }else{
                       montoD -= montoP;
                       montoP = 0;
                       PreparedStatement pst2 = cn2.prepareStatement("update deudas2 set Monto where ID_Deud = " + id_Deuda);
                       pst2.setInt(3,montoD);
                       pst2.executeUpdate();
                   }
               
               
               }
              }while(result.next() || montoP <= 0);
               
               
        
           
           }else{
           JOptionPane.showMessageDialog(null, "El Cliente no tiene Deudas que Pagar");
           }
       
       }catch(Exception e){JOptionPane.showMessageDialog(null, "ERROR en la coneccion con la base de datos");}  
    

}




  public static void main(String[]args){}  
    
    
    
}
    
    
    
   
    
    

