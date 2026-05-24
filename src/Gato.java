/*
Archivo: Gato.java
Descripcion:
Clase hija que hereda de Mascota.
Representa a un gato dentro del sistema
*/

public class Gato extends Animal {

    // Constructor
    public Gato(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }

    // Comportamiento distinto segun el tipo de objeto
    @Override
    public String hacerSonido() {
        return "Miau miau";
    }
}
