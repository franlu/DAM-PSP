#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>

int main(void){

  int fp;
  int p, bytesleidos;
  char saludo[] = "Un saludo!!!\n", buffer[10];

  p=mkfifo("FIFO", S_IFIFO|0666); //permiso de lectura y escritura

  if (p==-1){
    printf("ERROR al crear el FIFO...)\n", );
    exit(0);
  }

  while(1){
    fp=open("FIFO",0);
    bytesleidos= read(fp,buffer,1);
    printf("Recogindo datos del pipe...");
    while(bytesleidos != 0){
      printf("%1c", buffer[0]);
      bytesleidos= read(fp,buffer,1);
    }
    close(fp);
  }
  return 0;
}
