#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<signal.h>
#include<sys/ipc.h>
#include<sys/shm.h>
int main(int argc, char *argv[])
{
        int shid;
        char *msgad;
        msgad=(char *)shmat(atoi(argv[1]),0,0);
        printf("\nThe value is %s\n",msgad);
        return (0);
        }
         
          
