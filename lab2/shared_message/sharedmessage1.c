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
                message.msgtype=1;
                printf("\n write data : ");
                gets(message.msgtext);
                msgsnd(msgid,&message,sizeof(message),0);
                printf("\n Send data is:\t%s\n",message.msgtext);
                }
             
