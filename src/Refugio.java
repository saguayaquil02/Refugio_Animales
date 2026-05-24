/*
Archivo: Refugio.java
Descripcion: Esta clase se encargará de administrar la colección de animales usando un ArrayList y contendra las operaciones principales
*/

import java.util.ArrayList;
// java.util.List permite manejar colecciones ordenadas de objetos
import java.util.List;

public class Refugio {
    // Uso de colecciones con encapsulamiento
    private List<Animal> listaAnimales;

    // Constructor
    public Refugio() {
        this.listaAnimales = new ArrayList<>(); // Inicializamos la lista vacía
    }

    // Metodo para registrar cualquier tipo de animal 
    public void registrarAnimal(Animal nuevoAnimal) {
        listaAnimales.add(nuevoAnimal);
        System.out.println(nuevoAnimal.getClass().getSimpleName() + " registrado con exito");
    }

    public void mostrarAnimales() {
        if (listaAnimales.isEmpty()) {
            System.out.println("El refugio no tiene animales registrados en este momento");
            return;
        }
        
        System.out.println("\n--- Lista de Animales en el Refugio ---");
        for (Animal animal : listaAnimales) { // recorrido de la colección
            System.out.println("-----------------------------------");
            animal.mostrarInfo();
            System.out.println("Tipo: " + animal.getClass().getSimpleName());
            System.out.println("Sonido: " + animal.hacerSonido());
        }
    }

    // buscar un animal por id
    public Animal buscarAnimalPorId(int id) {
        for (Animal animal : listaAnimales) {
            if (animal.getId() == id) {
                return animal; // Retorna el objeto si lo encuentra
            }
        }
        return null; // Retorna nulo si no existe
    }

    // Cambiar el estado de un animal
    public void cambiarEstadoAnimal(int id) {
        Animal animalEncontrado = buscarAnimalPorId(id);
        
        // Validación
        if (animalEncontrado != null) {
            // Cambiamos el estado alternando entre ACTIVO y ADOPTADO
            if (animalEncontrado.getEstado().equals("ACTIVO")) {
                animalEncontrado.setEstado("ADOPTADO");
            } else {
                animalEncontrado.setEstado("ACTIVO");
            }
            System.out.println("El estado de " + animalEncontrado.getNombre() + " ha sido actualizado a: " + animalEncontrado.getEstado());
        } else {
            System.out.println("Error: No se encontro ningun animal con el ID " + id); 
        }
    }

    // Realizar una operación sobre un animal específico
    public void ejecutarAccionEspecifica(int id) {
        Animal animalEncontrado = buscarAnimalPorId(id);
        
        if (animalEncontrado != null) {
            System.out.println("El " + animalEncontrado.getClass().getSimpleName() + " " + animalEncontrado.getNombre() + " hace: " + animalEncontrado.hacerSonido());
        } else {
            System.out.println("Error: No se encontro ningun animal con el ID " + id);
        }
    }
}