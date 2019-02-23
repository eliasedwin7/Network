
// Java program to read data of various types using Scanner class. 
import java.util.Scanner; 
public class input 
{ 
    public static void main(String[] args) 
    { 
        // Declare the object and initialize with 
        // predefined standard input object 
        Scanner sc = new Scanner(System.in); 
  
        // String input 
        String name = sc.nextLine(); 
  
        // Character input 
        char gender = sc.next().charAt(0); 
  
        // Numerical data input 
        // byte, short and float can be read 
        // using similar-named functions. 
        int age = sc.nextInt(); 
        long mobileNo = sc.nextLong(); 
        double cgpa = sc.nextDouble(); 
  
        // Print the values to check if input was correctly obtained. 
        System.out.println("Name: "+name); 
        System.out.println("Gender: "+gender); 
        System.out.println("Age: "+age); 
        System.out.println("Mobile Number: "+mobileNo); 
        System.out.println("CGPA: "+cgpa); 
    } 
} 


/*#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>
#include<semaphore.h>

sem_t mutex;
sem_t rw_mutex;
int readers_count;

void *writer(int wno)
{
	while(1)
	{
		sem_wait(&rw_mutex);
		printf("\nWriter %d is writing!......",wno);
		sleep(2);
		printf("\nWriter %d finished writing!.....",wno);
		sem_post(&rw_mutex);
		sleep(2);
	}
}

void *reader(int rno)
{
	while(1)
	{
		sem_wait(&mutex);
		readers_count++;
		if(readers_count==1)
			sem_wait(&rw_mutex);
		sem_post(&mutex);
		printf("\nReader %d is Reading. Total Readers Now : %d",rno,readers_count);
		sleep(3);
		sem_wait(&mutex);
		readers_count--;
		printf("\nReader %d is finished Reading. Total Readers Now : %d",rno,readers_count);
		if(readers_count==0)
			sem_post(&rw_mutex);
		sem_post(&mutex);
		sleep(3);
	}
}

int main(void)
{
	pthread_t t1[5],t2[2];
	int i,j;
	sem_init(&mutex,0,1);
	sem_init(&rw_mutex,0,1);
	readers_count=0;
	//----------------------------------------------------------
	for(i=0;i<5;++i)
		pthread_create(&t1[i],NULL,reader,(void *)i);
	for(i=0;i<2;++i)
		pthread_create(&t2[i],NULL,writer,(void *)i);
	for(i=0;i<5;++i)
		pthread_join(&t1[i],NULL);
	for(i=0;i<2;++i)
		pthread_join(&t1[i],NULL);
	//----------------------------------------------------------
	return(0);
}*/
