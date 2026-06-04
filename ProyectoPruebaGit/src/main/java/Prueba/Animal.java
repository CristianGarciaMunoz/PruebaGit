package Prueba;

/**
 * Clase animal
 * 
 * @author Cristian
 * @version 1.4
 */
public class Animal {
    // Atributos

    /**
     * Atributo que me indica cual es la dieta del animal 
     */
    protected String dieta;

    /**
     * Atributo que me indica cual es el nombre del animal
     */
    protected String nombre;

    /**
     * Atributo que me indica la edad del animal
     */
    protected int edad;  

    // Constructores

    /**
     * Constructor sin parametros de Animal
     */
    public Animal() {
        this.dieta = "";
        this.nombre = "";
        this.edad = 0;
    }

    /**
     * Constructor con parametros de Animal
     * 
     * @param dieta
     * @param nombre
     * @param edad
     */
    public Animal(String dieta, String nombre, int edad) {
        this.dieta = dieta;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Setters

    /**
     * Set que me cambia el tipo de dieta del animal
     * 
     * @param dieta
     */
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    /**
     * Set que me cambia el nombre del animal
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Set que me cambia la edad del animal
     * 
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método que le da la posibilidad de respirar al animal

    /**
     * Metodo para respirar, que no hace nada
     */
    public void respirar() {}

    // Getters

    /**
     * Get que me devuelve el tipo de dieta del animal
     * 
     * @return
     */
    public String getDieta() {
        return dieta;
    }

    /**
     * Get que me devuelve el nombre del animal
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Get que me devuelve la edad del animal
     * 
     * @return
     */
    public int getEdad() {
        return edad;
    }
    
    // Método para que el animal se alimente

    /**
     * Metodo para comer, que no hace nada
     */
    public void comer() {}
}
