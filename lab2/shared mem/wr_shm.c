//Writer

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<signal.h>
#include<sys/ipc.h>
#include<sys/shm.h>

 void main()
 {
        key_t key=IPC_PRIVATE;
        int shid=shmget(key,1000,0777|IPC_CREAT);
        char *msg=(char *)shmat(shid,0,0);
          sprintf(msg,"HELLO");
         printf("\nMessage :%s written with key : %d\n",msg,shid);
         }
         
          
 
