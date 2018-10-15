
/*
* Ejemplo de uso de la función execl
* Se muestras los procesos activos en el momento de la ejecución
*/
#include <unistd.h>
#include <stdio.h>

void main {

  printf("Ejemplo de uso de exec():\n", );
  printf("Los archivos en el directorio son:\n", );
  if (execl("/bin/ps", "ps", "-f",(char *)NULL) < 0)
    printf("Error en exec %d\n", errno);
  else
    printf("Fin de la lista de procesos.");


}
