/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.packages;

import my.packages.view.initB;
import my.packages.utilities.DBconnection;

/**
 *
 * @author rhino
 */
public class ProjectED {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
//        conexion.select();
//        conexion.update();
        //empresa.addUsuario("cesar", "solano", 22, "rhino", "1234", "Cedula", -1, "masculino", "csolanoc@unal.edu.co", "bogota",-1, 0, 1);
        //empresa.addUsuario("Cesar", "Solano", 22, "cesar123", "cesar123", "Cedula", 1, "masculino", "cesar123@", "bogota", 123, 0, 1);
        
        initB frame = new initB(empresa, empresa.getConnection());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
}
