package ici3241.proyecto.modelo;

public class ExistentElementException extends Exception {
    public ExistentElementException() {
        super("El elemento ingresado ya existe");
    }
}
