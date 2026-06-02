package Prueba;

/**
 *
 * @author PC-17
 */
public class Animal {
    // Atributos
    protected String dieta;
    protected String nombre;
    protected int edad;  

    // Constructores
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

    // Setters
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método que le da la posibilidad de respirar al animal
    public void respirar() {}

    // Getters
    public String getDieta() {
        return dieta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    // Método para que el animal se alimente
    public void comer() {}
}
