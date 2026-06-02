package Prueba;

/**
 *
 * @author PC-17
 */
public class Animal {
    protected String dieta;
    protected String nombre;
    protected int edad;  

    public Animal animal() {
        this.dieta = "";
        this.nombre = "";
        this.edad = 0;
    }

    public Animal animal(String dieta, String nombre, int edad) {
        this.dieta = dieta;
        this.nombre = nombre;
        this.edad = edad;
    }
    
}
