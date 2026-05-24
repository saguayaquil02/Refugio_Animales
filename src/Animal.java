/*
Archivo: Animal.java
Enunciado: Crea una clase llamada Animal que represente una mascota sencilla.
La clase debe tener los siguientes atributos:
    • id
    • nombre
    • edad
    • estado
Descricion:
Clase padre que presenta un Animal en general
Aqui colocamos lo que todos los animales tienen en comun
*/

public class Animal {
    // Atributos privados
    private int id;
    private String nombre;
    private int edad;
    private String estado; // Puede ser "ACTIVO" o "ADOPTADO"

    // Constructor
    public Animal(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = "ACTIVO"; // Todo animal inicia como "ACTIVO" por defecto
    }

    // Método que muestra los datos del animal
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Estado: " + estado);
    }

    // Metodo que será sobrescrito en las subclases
    public String hacerSonido() {
        return "El animal hace un sonido";
    }

    // --- Getters y Setters ---
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}