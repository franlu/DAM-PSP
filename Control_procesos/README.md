## Control de proceso en GNU/Linux

### Creación y ejecución
- [execl](https://github.com/franlu/DAM-PSP/blob/master/Control_procesos/execl.c)

###### Actividad

Realiza un programa en C para ver el PID del proceso actual y el proceso padre.
Utiliza las funciones _getpid y getppid_.

- [fork](https://github.com/franlu/DAM-PSP/blob/master/Control_procesos/fork.c)
- [fork1](https://github.com/franlu/DAM-PSP/blob/master/Control_procesos/fork1.c)

###### Actividad

Realiza un programa en C que cree un proceso. El programa definirá una variable
entera y le dará el valor 10. El proceso padre incrementará el valor en 4 y el hijo
restará 4. Se deben mostrar los valores en pantalla.

### Comunicación entre procesos
- [ficheros](https://github.com/franlu/DAM-PSP/blob/master/Control_procesos/fichero.c)
- [pipe](https://github.com/franlu/DAM-PSP/blob/master/Control_procesos/pipe.c)
- [pipe](https://github.com/franlu/DAM-PSP/blob/master/Control_procesos/pipepadrehijo.c) Comunicación padre a hijo

###### Actividad

Realiza un programa en C en el que el proceso hijo envia información al proceso padre.

- Pipe con nombre (FIFO)
  - [Lectura](https://github.com/franlu/DAM-PSP/blob/master/Control_procesos/fifocrea.c)
  - [Escritura](https://github.com/franlu/DAM-PSP/blob/master/Control_procesos/fifoescribe.c)
