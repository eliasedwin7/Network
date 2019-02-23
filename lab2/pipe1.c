#include<stdio.h>
#include<stdlib.h>

void main()
{
        int pid,p[2],q[2];
        pipe(p);
        pipe(q);
        char msg1[50],msg2[50];
        pid=fork();
        if(pid==0)
                {
                close(p[0]);
                close(q[1]);
                printf("\n enter the message to parent process;\t ");
                scanf("%s",msg1);
                write(p[1],&msg1,sizeof(msg1));
                printf("\n Message from parent:\t");
                read(q[0],&msg1,sizeof(msg1));
                printf("%s\n",msg1);
                }
        else if(pid>0)
                {
                    
                close(p[1]);
                close(q[0]);
                printf("\n enter the message to child process;\t");
                scanf("%s",msg1);
                write(q[1],&msg1,sizeof(msg1));
                printf("\n Message from child:\t");
                read(p[0],&msg1,sizeof(msg1));
                printf("%s\n",msg1);
                }
        else
                printf("\n failed\n");
     }
                

