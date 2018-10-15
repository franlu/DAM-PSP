/*
* Ejemplo de uso de la función fork
* El proceso actual (abuelo) crea un proceso (hijo) y
* el proceso hijo del hijo (nieto)
*/
#include <stdio.h>
#include <stdlib.h>


int main(){

	pid_t pid, hijo_pid, pid2, hijo2_pid;

	pid = fork(); // Soy el Abuelo, creo a Hijo

	if(pid == -1){ // error
		printf("No se ha podido crear el proceso hijo....\n");
	}
	else if( pid == 0 ){ // hijo
    pid2 = fork(); // Soy el Hijo, creo a Nieto
    switch (pid2) {
      case -1:
        printf("No se ha podido crear el proceso hijo en el HIJO\n");
        exit(-1);
        break;
      case 0:
        printf("\t\t Soy el proceso NIETO %d; Mi PADRE es = %d\n",
                getpid(), getppid());
        break;
      default: // proceso PADRE
      hijo2_pid = wait(NULL);
      printf("\t\t Soy el proceso HIJO %d; Mi PADRE es = %d\n",
              getpid(), getppid());
      printf("Mi hijo: %d terminó\n", hijo2_pid);

    }
    printf("Soy el proceso hijo... \n");
		printf("Mi PID es: %d, y mi proceso padre es: %d\n\n", getpid(), getppid());
	}
  else { // proceso padre
		hijo_pid = wait(NULL);
		printf("Soy el proceso ABUELO... \n\t
            Mi PID es %d, mi HIJO: %d terminó. \n\t",
            getpid(), pid);
	}

	exit(0);
}
