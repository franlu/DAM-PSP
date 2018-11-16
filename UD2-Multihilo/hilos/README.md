# Gestión de Hilos

**Definición:** Un hilo es una secuencia de código en ejecución dentro del contexto de un proceso. Los hilos no pueden ejecutarse ellos solos, necesitan la supervisión de un proceso padre para ejecutarse. Dentro de cada proceso hay varios hilos ejecutandose.

#### Thread

- [Hilo0](https://github.com/franlu/DAM-PSP/blob/master/UD2-Multihilo/hilos/Hilo0Thread.java)
- [Mi primer hilo](https://github.com/franlu/DAM-PSP/blob/master/UD2-Multihilo/hilos/HiloThread.java)
- [Mi segundo hilo](https://github.com/franlu/DAM-PSP/blob/master/UD2-Multihilo/hilos/Hilo1Thread.java)
- [Métodos](https://github.com/franlu/DAM-PSP/blob/master/UD2-Multihilo/hilos/Hilo2Thread.java)
- [Grupos de hilos](https://github.com/franlu/DAM-PSP/blob/master/UD2-Multihilo/hilos/Hilo3Thread.java)

#### Runnable

- [Hola Runnable](https://github.com/franlu/DAM-PSP/blob/master/UD2-Multihilo/hilos/Hilo4Runnable.java)
- [Reloj](https://github.com/franlu/DAM-PSP/blob/master/hilos/UD2-Multihilo/Hilo5Reloj.java)
- [Contador](https://github.com/franlu/DAM-PSP/blob/master/UD2-Multihilo/hilos/Hilo6Applet.java)

### Ejercicios Thread

1. **Hola Mundo:** Crea una clase para visualizar el mensaje "Hola Mundo!". A continuación, crea un programa que visualice el mensaje anterior cinco veces creando para ello cinco hilos diferenes usando la clase anterior. Modifica el mensaje "Hola mundo!" en el hilo para incluir el identificador de hilo.

2. **TIC TAC:** Crea dos clases(hilos) Java. Uno de los hilos debe visualizar en pantalla en un bucle infinito la palabra TIC y el otro la palabra TAC. Dentro del bucle utiliza el método sleep() para que de tiempo a ver las palabras que se visualizan cuando lo ejecutemos. Añade un bloque try-catch(InterruptedException). Crea la función main() que haga uso de los hilos anteriores. ¿Se visualiza de forma ordena TIC TAC TIC TAC ...?

### Ejercicios

1. **Ficheros:** Crea una aplicación que reciba a través de sus argumentos una lista de ficheros de texto y cuente el número de caracteres que hay en cada fichero. Modifica el programa para que se cree un hilo para cada fichero a contar. En ambos casos muestra el tiempo que tarda en contar todos los ficheros.
```
long t_inicio, t_fin;
t_inicio = System.currentTimeMillis(); // tiempo en milisegundos
// Tarea a realizar
t_fin = System.currentTimeMillis();
long tiempo_total = t_fin - t_inicio
```