/*
* Ejemplo de lectura y escritura sobre un fichero de texto.
*/
#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>


int main(){

char mensaje[] = "Tierra llamando a Marte. ¿Me recibes Marte?";
char buffer[10];
int fd, bytesleidos;

// se abre el fichero solo para escritura
fd = open("texto.txt",1)

if (fd == -1) {
  printf("ERROR al abrir el fichero :(");
  exit(-1);
}

printf("Comenzando la ESCRITURA en el fichero...\n", );
write(fd, mensaje, strlen(mensaje));
close(fd);

// se abre el fichero solo para lectura
fd = open("texto.txt",0);
printf("Comenzando la LECTURA en el fichero...\n", );

//se leen bytes de uno en uno y se almacenan en buffer
bytesleidos = read(fd, buffer, 1);
while(bytesleidos != 0){
  printf("%1c", buffer[0]);
  bytesleidos = read(fd, buffer, 1);
}
close(fd);

}
