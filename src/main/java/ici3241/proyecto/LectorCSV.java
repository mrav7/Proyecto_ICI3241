package ici3241.proyecto;
import java.io.*;

import javax.swing.JOptionPane;

public class LectorCSV {

    private BufferedReader reader;
    private String linea;
    private String archivo[] = null;
    
    public void leerCSV(String direccionCSV){        
        try {
            reader = new BufferedReader(new FileReader(direccionCSV));
            while ((linea = reader.readLine()) != null) {
                archivo = linea.split(",");                
            }
            reader.close();
            linea = null;
            archivo = null;            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }      
        
    }
    
}
