#include <pthread.h>
#include <stdio.h>

void *thread1_function(void *arg)
{
    for (int i = 1; i <= 100; i++)
    {
        printf("Thread 1: %d\n", i);
    }
    return NULL;
}

void *thread2_function(void *arg)
{
    for (int i = 100; i >= 1; i--)
    {
        printf("Thread 2: %d\n", i);
    }
    return NULL;
}

int main(void)
{
    pthread_t thread1, thread2;
    pthread_create(&thread1, NULL, thread1_function, NULL);
    pthread_create(&thread2, NULL, thread2_function, NULL);

    pthread_join(thread1, NULL);
    pthread_join(thread2, NULL);
    return 0;
}