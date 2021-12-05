package ici3241.proyecto.modelo;

public class InvalidInputException extends Exception {    
    public InvalidInputException() {
        super("El dato ingresado no es válido");
    }    
}
