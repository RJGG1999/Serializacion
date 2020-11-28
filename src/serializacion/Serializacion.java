/*
* Java - Metodo de serialización
* Copyright 2020 Raúl Garibay Gamero
*/
package serializacion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Serializacion {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Registro().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Serializacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
