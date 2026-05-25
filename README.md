# Mini-proyecto en Java POO - Sistema de Gestión de Refugio

Este es un mini-proyecto de consola desarrollado en **Java** para el bloque de Programación Orientada a Objetos (POO). El sistema permite administrar de forma dinámica el registro, control de estado y las acciones de diferentes tipos de animales alojados dentro de un refugio.

## Descripción
Este repositorio corresponde al Mini - proyecto en Java POO.
El programa simula el funcionamiento interno de un refugio mediante una arquitectura limpia y modular que separa por completo la lógica del negocio de la interfaz de usuario en consola. El sistema soporta la gestión de animales genéricos y subtipos específicos (como perros y gatos), permitiendo un control interactivo sobre sus perfiles de adopción y comportamientos individuales.

## Información del Estudiante
* **Bootcamp:** Programación Cero a POO
* **Modalidad:** Individual

### Conceptos Clave de POO Implementados:
1. **Encapsulamiento:** Todos los atributos de las entidades se definieron con el modificador de acceso `private`, protegiendo la integridad de los datos y permitiendo su lectura/escritura controlada mediante métodos públicos *Getters y Setters*.
2. **Herencia:** Las clases específicas `Perro` y `Gato` extienden (`extends`) de la clase base `Animal`, reutilizando de manera eficiente atributos comunes como `id`, `nombre`, `edad` y `estado`.
3. **Polimorfismo:** Se implementó mediante la sobrescritura de métodos (`@Override`). Al recorrer la lista, el sistema invoca la función dinámica `hacerSonido()`, respondiendo de manera única según el tipo real del objeto en tiempo de ejecución.
4. **Colecciones Dinámicas:** Se utilizó la interfaz `List` junto con la implementación `ArrayList` para almacenar y manipular la colección de objetos sin restricciones de tamaño fijo.
5. **Manejo de Excepciones y Validaciones:** El flujo está protegido por bloques `try-catch` capaces de capturar errores de tipo de dato (`InputMismatchException`). Además, se aplican filtros condicionales estrictos que impiden registrar animales con IDs inválidos, edades negativas o nombres vacíos.

## Estructura del Código

El proyecto está organizado en 5 archivos independientes para garantizar una correcta separación de responsabilidades:

* **`Animal.java`**: Clase base que define las características generales y el comportamiento por defecto de cualquier animal.
* **`Perro.java`**: Subclase que hereda de `Animal` y personaliza su sonido específico ("Guau guau").
* **`Gato.java`**: Subclase que hereda de `Animal` y personaliza su sonido específico ("Miau miau").
* **`Refugio.java`**: Clase gestora (controlador) que encapsula el `ArrayList`, administrando las operaciones de registro, impresión de reportes y búsquedas.
* **`App.java`**: Punto de entrada de la aplicación, responsable único de desplegar el menú interactivo y capturar las entradas del usuario.
  

## Ejecución y Compilación

* **Java Development Kit (JDK):** Versión 1.8 o superior instalada.
* **Consola de comandos:** Terminal, PowerShell, CMD o la consola integrada de tu IDE como VS code
* **Git:** Para el control y revisión del historial de versiones.
