# Gestión de Hilos

**Definición:** Un hilo es una secuencia de código en ejecución dentro del contexto de un proceso. Los hilos no pueden ejecutarse ellos solos, necesitan la supervisión de un proceso padre para ejecutarse. Dentro de cada proceso hay varios hilos ejecutandose.

- [Mi primer hilo](https://github.com/franlu/DAM-PSP/blob/master/hilos/hiloThread.java)
- [Mi segundo hilo](https://github.com/franlu/DAM-PSP/blob/master/hilos/Hilo1Thread.java)
- [Métodos](https://github.com/franlu/DAM-PSP/blob/master/hilos/Hilo2Thread.java)
- [Grupos de hilos](https://github.com/franlu/DAM-PSP/blob/master/hilos/Hilo3Thread.java)

### Ejercicios

1. **Hola Mundo:** Crea una clase para visualizar el mensaje "Hola Mundo!". A continuación, crea un programa que visualice el mensaje anterior cinco veces creando para ello cinco hilos diferenes usando la clase anterior. Modifica el mensaje "Hola mundo!" en el hilo para incluir el identificador de hilo.

2. **TIC TAC:** Crea dos clases(hilos) Java. Uno de los hilos debe visualizar en pantalla en un bucle infinito la palabra TIC y el otro la palabra TAC. Dentro del bucle utiliza el método sleep() para que de tiempo a ver las palabras que se visualizan cuando lo ejecutemos. Añade un bloque try-catch(InterruptedException). Crea la función main() que haga uso de los hilos anteriores. ¿Se visualiza de forma ordena TIC TAC TIC TAC ...?