/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb;

import javax.swing.*;
import java.sql.*;


/**
 *
 * @author Diego Trujillo
 */
public class cargarCombo {
   // Conexion conexionURL = new Conexion();
   
    public void consultar(JComboBox comboTipo ) throws SQLException{
    try{
       Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("EXECUTE consulta_cuentatipo");
       ResultSet result = ps.executeQuery();
       
       //LLENAR EL COMBOBOX
       comboTipo.addItem("Seleccione tipo cuenta");
       while(result.next()){
       comboTipo.addItem(result.getString("cta_tipo"));
       
       }
       
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
    }
    }
    
    public void consultar2(JComboBox comoEstado ) throws SQLException{
    try{
       Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("EXECUTE consulta_estado");
       ResultSet result = ps.executeQuery();
       
       //LLENAR EL COMBOBOX
       comoEstado.addItem("Seleccionar Estado");
       while(result.next()){
       comoEstado.addItem(result.getString("estado"));
       
       }
       
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
    }
    }
    
    
    
}
