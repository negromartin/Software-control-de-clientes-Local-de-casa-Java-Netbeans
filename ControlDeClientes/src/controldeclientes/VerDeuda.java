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

/**
 *
 * @author Martin
 */
public class VerDeuda extends javax.swing.JFrame {
    public static int ID_Cliente;
   public static String apellido, nombre;
    /**
     * Creates new form VerDeuda
     */
    public VerDeuda() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        VentanaBuscarCliente cr = new VentanaBuscarCliente();
        this.apellido = cr.apellidoSalida;
        this.nombre = cr.nombreSalida;
        this.ID_Cliente = cr.ID_Cliente;
        
       labelNombre.setText(nombre+" "+apellido);
     
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        campoSalida = new javax.swing.JTextArea();
        Volver = new javax.swing.JButton();
        botonVerDeudas = new javax.swing.JButton();
        botonCargarDeuda = new javax.swing.JButton();
        botonCargarPago = new javax.swing.JButton();
        botonVerPagos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoSalida.setEditable(false);
        campoSalida.setBackground(new java.awt.Color(216, 21, 60));
        campoSalida.setColumns(20);
        campoSalida.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        campoSalida.setForeground(new java.awt.Color(255, 255, 255));
        campoSalida.setRows(5);
        campoSalida.setText("Que desea hacer con el Cliente?? \n\n1) Ver Deuda: Lista todas las deudas del Cliente.\n\n2) Cargar Deuda: Carga una nueva deuda al Cliente.\n\n3) Ver pagos: Lista todos los pagos del Cliente.\n\n4) Cargar Pago: Carga un pago del Cliente.\n\n\n");
        jScrollPane1.setViewportView(campoSalida);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 580, 340));

        Volver.setBackground(new java.awt.Color(216, 21, 60));
        Volver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 255, 255));
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 80, 30));

        botonVerDeudas.setBackground(new java.awt.Color(216, 21, 60));
        botonVerDeudas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonVerDeudas.setForeground(new java.awt.Color(255, 255, 255));
        botonVerDeudas.setText("Ver Deudas");
        botonVerDeudas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDeudasActionPerformed(evt);
            }
        });
        getContentPane().add(botonVerDeudas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 120, 30));

        botonCargarDeuda.setBackground(new java.awt.Color(216, 21, 60));
        botonCargarDeuda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCargarDeuda.setForeground(new java.awt.Color(255, 255, 255));
        botonCargarDeuda.setText("Cargar Deuda ");
        botonCargarDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarDeudaActionPerformed(evt);
            }
        });
        getContentPane().add(botonCargarDeuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 120, 30));

        botonCargarPago.setBackground(new java.awt.Color(216, 21, 60));
        botonCargarPago.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCargarPago.setForeground(new java.awt.Color(255, 255, 255));
        botonCargarPago.setText("Cargar Pago");
        botonCargarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarPagoActionPerformed(evt);
            }
        });
        getContentPane().add(botonCargarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 120, 30));

        botonVerPagos.setBackground(new java.awt.Color(216, 21, 60));
        botonVerPagos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonVerPagos.setForeground(new java.awt.Color(255, 255, 255));
        botonVerPagos.setText("Ver pagos");
        botonVerPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerPagosActionPerformed(evt);
            }
        });
        getContentPane().add(botonVerPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controldeclientes/Imagenes/Mushroom_Mini_Icon_64.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administrar Cliente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("©TheBlackPeople");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, -1, -1));

        labelNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 380, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controldeclientes/Imagenes/Fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 862, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        VentanaBuscarCliente ventanaAtras = new VentanaBuscarCliente();
            ventanaAtras.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_VolverActionPerformed

    private void botonCargarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarPagoActionPerformed
       VentanaCargarPago ventanaSiguiente = new VentanaCargarPago();
       ventanaSiguiente.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botonCargarPagoActionPerformed

    private void botonVerDeudasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDeudasActionPerformed
     campoSalida.setText(""); 
     String salida = "";
     
     try{
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistemaclientes","root","");
           PreparedStatement pst = cn.prepareStatement("select * from deudas2 where ID_Deudor = ?");
           pst.setInt(1,ID_Cliente);
           
           ResultSet result = pst.executeQuery();
           
           
           
           
           
           
           if(result.next()){
                  salida+= ("Fecha       "+"Monto     "+"Descripcion       "+"\n");
                 do{
                  salida +=  (result.getString(2)+"   $"+result.getInt(3)+"    "+result.getString(4)+"\n");
                   
                     
                 }while(result.next());
                 
                    campoSalida.setText(salida);
                
       
             
           
           }else{
             campoSalida.setText("El Cliente NO tiene deudas.");
           }
       
       }catch(Exception e){JOptionPane.showMessageDialog(null, "No se conecta a la base de datos");}   
    }//GEN-LAST:event_botonVerDeudasActionPerformed

    private void botonCargarDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarDeudaActionPerformed
        VentanaCargarDeuda ventanaSig =  new VentanaCargarDeuda();
        ventanaSig.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_botonCargarDeudaActionPerformed

    private void botonVerPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerPagosActionPerformed
      campoSalida.setText(""); 
     String salida = "";
     
     try{
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistemaclientes","root","");
           PreparedStatement pst = cn.prepareStatement("select * from pagos where ID_Cliente = ?");
           pst.setInt(1,ID_Cliente);
           
           ResultSet result = pst.executeQuery();
           
           
           
           
           
           
           if(result.next()){
                  salida+= ("Fecha    \t"+"Monto\t"+"Descripcion\t"+"\n\n");
                 do{
                  salida +=  (result.getString(2)+"\t$"+result.getInt(3)+"\t"+result.getString(4)+"\n");
                   
                     
                 }while(result.next());
                 
                    campoSalida.setText(salida);
                
       
             
           
           }else{
                    campoSalida.setText("El Cliente NO realizó ningún pago.");
           }
       
       }catch(Exception e){JOptionPane.showMessageDialog(null, "No se conecta a la base de datos");}    
    }//GEN-LAST:event_botonVerPagosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerDeuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerDeuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerDeuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerDeuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerDeuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton botonCargarDeuda;
    private javax.swing.JButton botonCargarPago;
    private javax.swing.JButton botonVerDeudas;
    private javax.swing.JButton botonVerPagos;
    private javax.swing.JTextArea campoSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables
}
