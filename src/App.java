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

            // Manejo básico de excepciones con try/catch
            try {
                // nextInt espera un número de forma estricta. Si el usuario escribe una letra, el Scanner se bloquea y lanza una excepción
                opcion = scanner.nextInt();
                // nextLine limpiar salto de línea restante para que el buffer quede vacío
                scanner.nextLine(); // Limpiar buffer del scanner

                switch (opcion) {
                    // caso 1 se deja pasar por que esta vacio
                    case 1: // Opción 1 (Perro) y Opción 2 (Gato) comparten la misma captura de datos
                    // Se resgitra el animal perro o gato
                    case 2:
                        System.out.println("\n-- Registrar Animal --");
                        System.out.print("Ingrese ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Ingrese Nombre: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Ingrese Edad: ");
                        int edad = scanner.nextInt();
                        scanner.nextLine();

                        // Validaciones (edad no negativa, etc.)
                        if (id <= 0 || edad < 0 || nombre.trim().isEmpty()) {
                            System.out.println("Error: Datos invalidos. El ID debe ser > 0, edad >= 0 y nombre no puede estar vacio");
                        } else {
                            if (opcion == 1) {
                                miRefugio.registrarAnimal(new Perro(id, nombre, edad));
                            } else {
                                miRefugio.registrarAnimal(new Gato(id, nombre, edad));
                            }
                        }
                        break;
                    case 3:
                        miRefugio.mostrarAnimales();
                        break;

                    case 4:
                        System.out.print("\nIngrese el ID a buscar: ");
                        int idBusqueda = scanner.nextInt();
                        Animal encontrado = miRefugio.buscarAnimalPorId(idBusqueda);
                        
                        // Controlar que el id buscado exista
                        if (encontrado != null) {
                            System.out.println("\nAnimal encontrado");
                            encontrado.mostrarInfo();
                        } else {
                            System.out.println("No se encontro ningun animal con ese ID en el refugio");
                        }
                        break;

                    case 5:
                        System.out.print("\nIngrese el ID del animal para cambiar su estado: ");
                        int idEstado = scanner.nextInt();
                        miRefugio.cambiarEstadoAnimal(idEstado);
                        break;

                    case 6:
                        System.out.print("\nIngrese el ID del animal para ejecutar su accion: ");
                        int idAccion = scanner.nextInt();
                        miRefugio.ejecutarAccionEspecifica(idAccion);
                        break;

                    case 7:
                        System.out.println("Saliendo del sistema del refugio...");
                        break;

                    default:
                        // REQUERIMIENTO: no aceptar opciones inválidas del menú
                        System.out.println("Opcion no valida. Por favor, seleccione un numero del 1 al 7");
                }

            } catch (InputMismatchException e) {
                // REQUERIMIENTO: Capturar errores al ingresar números en el menú
                System.out.println("Error de sistema: Entrada invalida. Debe ingresar un numero entero");
                scanner.nextLine(); // Limpiamos el buffer para que no se forme un bucle infinito
            }

        } while (opcion != 7);

        scanner.close(); // esto cierra el scanner

    }
}
