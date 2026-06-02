package Prueba;

/**
 *
 * @author PC-17
 */
public class Animal {
    protected String dieta;
    protected String nombre;
    protected int edad;  

    public Animal() {
        this.dieta = "";
        this.nombre = "";
        this.edad = 0;
    }

    public Animal(String dieta, String nombre, int edad) {
        this.dieta = dieta;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void respirar() {}

    public String getDieta() {
        return dieta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public void comer() {}
}
