/*
Archivo: Perro.java
Descripcion:
Clase hija que hereda de Mascota.
Representa a un perro dentro del sistema
*/

public class Perro extends Animal {

    // Constructor
    public Perro(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }

    // Usamos overrider para sobreescribir el metodo
    @Override
    public String hacerSonido() {
        return "Guau guau";
    }
}