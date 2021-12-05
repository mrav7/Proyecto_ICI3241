package ici3241.proyecto.controlador;
import java.io.*;

public class GestorUsuarios {
    
    public boolean register(String username, String password) throws IOException {
        if (("".equals(username)) || ("".equals(password)) ) {
            return false;        
        }
        FileWriter f = new FileWriter("./users.csv", true);
        PrintWriter w = new PrintWriter(f);
        w.printf("\n%s,%s",username, password);
        w.close();
        return true;
    }
    
    public String login(String username, String password) throws IOException {
        if (username.equals("admin")) {
            if (password.equals("admin")) {
                return "admin";
            } else {
                return (null);            
            }       
        } 
        
        BufferedReader br = new BufferedReader(new FileReader("./users.csv"));
        String linea;
        
        while ((linea = br.readLine()) != null) {
            String[] campos = new String[2];
            campos = linea.split(",");
            if ((campos[0].equals(username)) && (campos[1].equals(password))) {
                return username;
            }
        }
        return "error";
    }
    
    public GestorUsuarios() {
    }
    
    
}
