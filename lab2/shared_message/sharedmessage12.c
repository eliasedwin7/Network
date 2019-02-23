#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<signal.h>
#include<sys/ipc.h>
#include<sys/msg.h>
struct msgbuf
                        { 
                        long msgtype;
                        char msgtext[50];
                        }message;
             
             
             void main()
        {
                
                key_t key;
                key=ftok("progfile",65);
                int msgid=msgget(key,0666 |IPC_CREAT);
           
                
                
                msgrcv(msgid,&message,sizeof(message),1,0);
                printf("\n  data  received : ");
                puts(message.msgtext);
                msgctl(msgid,IPC_RMID,NULL);
                }
             
