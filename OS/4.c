#include <stdio.h>
#include <signal.h>
#include <unistd.h>
#include <stdlib.h>

void sigint_handler(int sig)
{
    printf("Caught SIGINT! Exiting...\n");
    exit(0);
}

int main(void)
{
    signal(SIGINT, sigint_handler);
    while(1) 
    {
        printf("Running...\n");
        sleep(1);
    }
    return 0;
}