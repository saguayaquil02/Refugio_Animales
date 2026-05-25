/*
Clase 14 - Mini-proyecto: Java POO
Titulo: Refugio de animales
Autor: Sebastian Guayaquil
Enunciado: Desarrollar un programa en Java consola que permita gestionar un pequeño refugio 
de animales. 
El sistema debe trabajar con una colección de animales registrados. No todos los 
animales son iguales. Como mínimo, deberán existir dos tipos específicos de 
animales que hereden de una clase base general. 
El programa deberá permitir registrar animales, mostrar la información almacenada, 
ejecutar una acción propia de cada tipo de animal y realizar una operación adicional 
sencilla sobre un animal específico. 
El objetivo no es hacer un sistema profesional ni extenso, sino un programa 
ordenado, funcional y coherente, donde se note claramente la aplicación de los 
temas vistos en clase. 
*/

import java.util.InputMismatchException;  // excepcion especifica cuando el usuario ingresa un tipo de dato que no coincide con el esperado
import java.util.Scanner; // Esta es la encargada de leer la entrada de datos por consola

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Instanciamos la clase gestora
        Refugio miRefugio = new Refugio(); 
        int opcion = 0;

        do {
            // Menú en consola con las opciones solicitadas
            System.out.println("\n=== MENU DEL REFUGIO DE ANIMALES ===");
            System.out.println("1. Registrar perro");
            System.out.println("2. Registrar gato");
            System.out.println("3. Mostrar animales");
            System.out.println("4. Buscar animal por id");
            System.out.println("5. Cambiar estado de un animal");
            System.out.println("6. Ejecutar accion o sonido de un animal");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

}
