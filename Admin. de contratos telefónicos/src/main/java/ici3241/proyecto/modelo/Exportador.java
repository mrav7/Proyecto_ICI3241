package ici3241.proyecto.modelo;
import java.io.*;

public interface Exportador {
    public abstract void exportarArchivoCSV() throws IOException;
    public abstract void exportarArchivoTXT() throws IOException;
}
