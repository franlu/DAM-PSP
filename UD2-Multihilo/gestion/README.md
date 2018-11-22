# Gestión de hilos


El método ```isAlive()``` devuelve _true_ si el hilo esta vivo, es decir a llamado a su método ```run()``` y aún no ha terminado su ejecución.
En caso contrario devuelve _false_.

### Parada segura

Para **suspender** de forma segura un hilo se debe introducir en el hilo una variable (bool) y comprobar su valor dentro
del método ```run()```. El método ```suspend()```(obsoleto) tiende a producir situaciones de interbloqueo.

Otra forma de finalizar el hilo es mediante una interrupción.

- [Interrupción](Interrupcion.java)

El método ```join()``` provoca que el hilo que hace la llamada espere a la finalización de otros hilos.

- [Join](Join.java)

### Prioridades

Los métodos **setPriority()** y **getPriority()** establecen y muestran la prioridad de un hilo. La prioridad es un valor entre 1 y 10.
```
MIN_PRIORITY = 1
NORM_PRIORITY = 5
MAX_PRIORITY = 10 
```
El hilo de mayor prioridad sigue funcionando hasta que:

	- Cede el control al método ```yield()```
	- Deja de ser ejecutable(Dead o Bloked)
	- Un hilo de mayor prioridad pasa a estado ejecutable.


- [Ejemplo inicial](HiloPrioridad.java)
- [Establecer prioridades](HiloPrioridad1.java)
- [Establecer prioridades 2](HiloPrioridad2.java)

En la práctica casi nunca hay que establecer a mano las prioridades. El comportamiento no esta garantizado, dependerá de la plataforma y de las aplicaciones que se esten ejecutando.

### Comunicación

Usualmente, para comunicarse los hilos comparten un objeto.

- [Compartir 1](HiloCompartir.java)

### Sincronización

Permite ejecutar un bloque de código(región crítica) de forma atómica.

- [Sincronizar 1](HiloSyncronized.java)

#### Métodos

Se debe evitar la sincronización de bloques de código y sustituirlas siempre que sea posible por la sincronización de métodos,
**exclusión mutua** de los procesos respecto a la variable compartida.

No es posible invocar dos métodos sincronizados del mismo objeto a la vez.

La sincronización disminuye el rendimiento de una aplicación, por lo tanto, debe emplearse
donde es **estrictamente necesario**.

- [Cuenta](HiloSyncronized1.java)
- [Cuenta sincronizada](HiloSyncronized2.java)

#### Bloqueo

- [Cadena 0](HiloBloqueo.java)
- [Cadena 1](HiloBloqueo1.java)

#### Productor-Consumidor

Es un problema típico de sincronización. Uno o más hilos producen datos a procesar y otros hilos los consumen.
El problema se da cuando uno va más rápido que el otro, es decir, el consumidor se puede saltar algún dato o
el consumidor puede recoger varias veces el mismo dato o puede no tener datos a recoger.

- [Cola](Cola.java) (Objeto compartido)
- [Consumidor](Consumidor.java)
- [Productor](Productor.java)
- [Main](Produc_Consum.java)


### Ejercicio

Usando el módelo productor-consumidor, crea un productor que lea caracteres de un fichero de texto cuyo nombre se pasará
al constructor. Y un consumidor que obtenga los datos que produce el productor y los visualice por pantalla. Muestra al final
del proceso del productor y del consumidor un mensaje indicando que el proceso ha finalizado. Prueba el programa con varios
consumidores ¿finalizan el proceso todos los consumidores?. Utiliza el método ```getState()``` para comprobar el estado de
los consumidores cuando el productor finaliza. Intenta que todos los consumidores finalicen correctamente.